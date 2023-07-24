.class public final Le/b/a/y/x/e;
.super Ljava/lang/ref/WeakReference;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/ref/WeakReference<",
        "Le/b/a/y/x/s0<",
        "*>;>;"
    }
.end annotation


# instance fields
.field public final a:Le/b/a/y/n;

.field public final b:Z

.field public c:Le/b/a/y/x/y0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/b/a/y/x/y0<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Le/b/a/y/n;Le/b/a/y/x/s0;Ljava/lang/ref/ReferenceQueue;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/y/n;",
            "Le/b/a/y/x/s0<",
            "*>;",
            "Ljava/lang/ref/ReferenceQueue<",
            "-",
            "Le/b/a/y/x/s0<",
            "*>;>;Z)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p2, p3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;Ljava/lang/ref/ReferenceQueue;)V

    .line 2
    invoke-static {p1}, Le/b/a/e0/r;->a(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p1, Le/b/a/y/n;

    iput-object p1, p0, Le/b/a/y/x/e;->a:Le/b/a/y/n;

    .line 3
    invoke-virtual {p2}, Le/b/a/y/x/s0;->f()Z

    move-result p1

    if-eqz p1, :cond_0

    if-eqz p4, :cond_0

    .line 4
    invoke-virtual {p2}, Le/b/a/y/x/s0;->e()Le/b/a/y/x/y0;

    move-result-object p1

    invoke-static {p1}, Le/b/a/e0/r;->a(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p1, Le/b/a/y/x/y0;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 5
    :goto_0
    iput-object p1, p0, Le/b/a/y/x/e;->c:Le/b/a/y/x/y0;

    .line 6
    invoke-virtual {p2}, Le/b/a/y/x/s0;->f()Z

    move-result p1

    iput-boolean p1, p0, Le/b/a/y/x/e;->b:Z

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput-object v0, p0, Le/b/a/y/x/e;->c:Le/b/a/y/x/y0;

    .line 2
    invoke-virtual {p0}, Ljava/lang/ref/WeakReference;->clear()V

    return-void
.end method
