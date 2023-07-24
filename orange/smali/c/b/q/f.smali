.class public Lc/b/q/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public b:Lc/b/q/i;

.field public final synthetic c:Lc/b/q/k;


# direct methods
.method public constructor <init>(Lc/b/q/k;Lc/b/q/i;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/b/q/f;->c:Lc/b/q/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p2, p0, Lc/b/q/f;->b:Lc/b/q/i;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/b/q/f;->c:Lc/b/q/k;

    invoke-static {v0}, Lc/b/q/k;->d(Lc/b/q/k;)Lc/b/p/o/m;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lc/b/q/f;->c:Lc/b/q/k;

    invoke-static {v0}, Lc/b/q/k;->e(Lc/b/q/k;)Lc/b/p/o/m;

    move-result-object v0

    invoke-virtual {v0}, Lc/b/p/o/m;->a()V

    .line 3
    :cond_0
    iget-object v0, p0, Lc/b/q/f;->c:Lc/b/q/k;

    invoke-static {v0}, Lc/b/q/k;->f(Lc/b/q/k;)Lc/b/p/o/a0;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {v0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lc/b/q/f;->b:Lc/b/q/i;

    invoke-virtual {v0}, Lc/b/p/o/y;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 5
    iget-object v0, p0, Lc/b/q/f;->c:Lc/b/q/k;

    iget-object v1, p0, Lc/b/q/f;->b:Lc/b/q/i;

    iput-object v1, v0, Lc/b/q/k;->x:Lc/b/q/i;

    .line 6
    :cond_1
    iget-object v0, p0, Lc/b/q/f;->c:Lc/b/q/k;

    const/4 v1, 0x0

    iput-object v1, v0, Lc/b/q/k;->z:Lc/b/q/f;

    return-void
.end method
