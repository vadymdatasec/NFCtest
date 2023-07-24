.class public final Le/f/a/d/a/b/o;
.super Le/f/a/d/a/b/l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Le/f/a/d/a/b/l<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic c:Le/f/a/d/a/b/q;


# direct methods
.method public constructor <init>(Le/f/a/d/a/b/q;Le/f/a/d/a/i/o;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/a/d/a/i/o<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Le/f/a/d/a/b/o;->c:Le/f/a/d/a/b/q;

    invoke-direct {p0, p1, p2}, Le/f/a/d/a/b/l;-><init>(Le/f/a/d/a/b/q;Le/f/a/d/a/i/o;)V

    return-void
.end method


# virtual methods
.method public final d(Landroid/os/Bundle;Landroid/os/Bundle;)V
    .locals 2

    invoke-super {p0, p1, p2}, Le/f/a/d/a/b/l;->d(Landroid/os/Bundle;Landroid/os/Bundle;)V

    iget-object p2, p0, Le/f/a/d/a/b/o;->c:Le/f/a/d/a/b/q;

    invoke-static {p2}, Le/f/a/d/a/b/q;->d(Le/f/a/d/a/b/q;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object p2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p2, v1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result p2

    if-nez p2, :cond_0

    invoke-static {}, Le/f/a/d/a/b/q;->c()Le/f/a/d/a/e/a;

    move-result-object p2

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "Expected keepingAlive to be true, but was false."

    invoke-virtual {p2, v1, v0}, Le/f/a/d/a/e/a;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    const-string p2, "keep_alive"

    invoke-virtual {p1, p2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Le/f/a/d/a/b/o;->c:Le/f/a/d/a/b/q;

    invoke-virtual {p1}, Le/f/a/d/a/b/q;->a()V

    :cond_1
    return-void
.end method
