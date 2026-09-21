class Foo {

    private final CountDownLatch latch1 = new CountDownLatch(1);
    private final CountDownLatch latch2 = new CountDownLatch(1);

    public Foo() {
    }

    public void first(Runnable printFirst) throws InterruptedException {
        try {
            printFirst.run();
        } finally {
            latch1.countDown();
        }
    }

    public void second(Runnable printSecond) throws InterruptedException {
        try {
            latch1.await();
            printSecond.run();
        } finally {
            latch2.countDown();
        }
    }

    public void third(Runnable printThird) throws InterruptedException {
        try {
            latch2.await();
            printThird.run();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}