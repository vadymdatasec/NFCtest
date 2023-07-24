.class public final synthetic Le/f/c/l/e/m/c2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/a/b/h/a;


# instance fields
.field public final a:Ljava/util/concurrent/CountDownLatch;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/CountDownLatch;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/f/c/l/e/m/c2;->a:Ljava/util/concurrent/CountDownLatch;

    return-void
.end method

.method public static a(Ljava/util/concurrent/CountDownLatch;)Le/f/a/b/h/a;
    .locals 1

    new-instance v0, Le/f/c/l/e/m/c2;

    invoke-direct {v0, p0}, Le/f/c/l/e/m/c2;-><init>(Ljava/util/concurrent/CountDownLatch;)V

    return-object v0
.end method


# virtual methods
.method public a(Le/f/a/b/h/g;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Le/f/c/l/e/m/c2;->a:Ljava/util/concurrent/CountDownLatch;

    invoke-static {v0, p1}, Le/f/c/l/e/m/h2;->a(Ljava/util/concurrent/CountDownLatch;Le/f/a/b/h/g;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
