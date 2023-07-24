.class public final Le/f/a/b/c/l/k/z;
.super Le/f/a/b/c/l/k/y;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Le/f/a/b/c/l/k/y<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field public final b:Le/f/a/b/c/l/k/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/a/b/c/l/k/i<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Le/f/a/b/c/l/k/i;Le/f/a/b/h/h;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/a/b/c/l/k/i<",
            "*>;",
            "Le/f/a/b/h/h<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x4

    .line 1
    invoke-direct {p0, v0, p2}, Le/f/a/b/c/l/k/y;-><init>(ILe/f/a/b/h/h;)V

    .line 2
    iput-object p1, p0, Le/f/a/b/c/l/k/z;->b:Le/f/a/b/c/l/k/i;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Le/f/a/b/c/l/k/l;Z)V
    .locals 0

    return-void
.end method

.method public final b(Le/f/a/b/c/l/k/c;)[Le/f/a/b/c/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/a/b/c/l/k/c<",
            "*>;)[",
            "Le/f/a/b/c/c;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Le/f/a/b/c/l/k/c;->k()Ljava/util/Map;

    move-result-object p1

    iget-object v0, p0, Le/f/a/b/c/l/k/z;->b:Le/f/a/b/c/l/k/i;

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Le/f/a/b/c/l/k/t;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 2
    :cond_0
    iget-object p1, p1, Le/f/a/b/c/l/k/t;->a:Le/f/a/b/c/l/k/j;

    invoke-virtual {p1}, Le/f/a/b/c/l/k/j;->b()[Le/f/a/b/c/c;

    move-result-object p1

    return-object p1
.end method

.method public final c(Le/f/a/b/c/l/k/c;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/a/b/c/l/k/c<",
            "*>;)Z"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Le/f/a/b/c/l/k/c;->k()Ljava/util/Map;

    move-result-object p1

    iget-object v0, p0, Le/f/a/b/c/l/k/z;->b:Le/f/a/b/c/l/k/i;

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Le/f/a/b/c/l/k/t;

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p1, Le/f/a/b/c/l/k/t;->a:Le/f/a/b/c/l/k/j;

    invoke-virtual {p1}, Le/f/a/b/c/l/k/j;->c()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final d(Le/f/a/b/c/l/k/c;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/a/b/c/l/k/c<",
            "*>;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Le/f/a/b/c/l/k/c;->k()Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Le/f/a/b/c/l/k/z;->b:Le/f/a/b/c/l/k/i;

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/f/a/b/c/l/k/t;

    if-eqz v0, :cond_0

    .line 2
    iget-object v1, v0, Le/f/a/b/c/l/k/t;->b:Le/f/a/b/c/l/k/k;

    invoke-virtual {p1}, Le/f/a/b/c/l/k/c;->f()Le/f/a/b/c/l/e;

    move-result-object p1

    iget-object v2, p0, Le/f/a/b/c/l/k/y;->a:Le/f/a/b/h/h;

    invoke-virtual {v1, p1, v2}, Le/f/a/b/c/l/k/k;->a(Le/f/a/b/c/l/b;Le/f/a/b/h/h;)V

    .line 3
    iget-object p1, v0, Le/f/a/b/c/l/k/t;->a:Le/f/a/b/c/l/k/j;

    invoke-virtual {p1}, Le/f/a/b/c/l/k/j;->a()V

    return-void

    .line 4
    :cond_0
    iget-object p1, p0, Le/f/a/b/c/l/k/y;->a:Le/f/a/b/h/h;

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p1, v0}, Le/f/a/b/h/h;->b(Ljava/lang/Object;)Z

    return-void
.end method
