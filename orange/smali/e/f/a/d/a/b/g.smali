.class public final Le/f/a/d/a/b/g;
.super Le/f/a/d/a/e/b;
.source "SourceFile"


# instance fields
.field public final synthetic c:I

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:I

.field public final synthetic g:Le/f/a/d/a/i/o;

.field public final synthetic h:Le/f/a/d/a/b/q;


# direct methods
.method public constructor <init>(Le/f/a/d/a/b/q;Le/f/a/d/a/i/o;ILjava/lang/String;Ljava/lang/String;ILe/f/a/d/a/i/o;)V
    .locals 0

    iput-object p1, p0, Le/f/a/d/a/b/g;->h:Le/f/a/d/a/b/q;

    iput p3, p0, Le/f/a/d/a/b/g;->c:I

    iput-object p4, p0, Le/f/a/d/a/b/g;->d:Ljava/lang/String;

    iput-object p5, p0, Le/f/a/d/a/b/g;->e:Ljava/lang/String;

    iput p6, p0, Le/f/a/d/a/b/g;->f:I

    iput-object p7, p0, Le/f/a/d/a/b/g;->g:Le/f/a/d/a/i/o;

    invoke-direct {p0, p2}, Le/f/a/d/a/e/b;-><init>(Le/f/a/d/a/i/o;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 8

    :try_start_0
    iget-object v0, p0, Le/f/a/d/a/b/g;->h:Le/f/a/d/a/b/q;

    invoke-static {v0}, Le/f/a/d/a/b/q;->b(Le/f/a/d/a/b/q;)Le/f/a/d/a/e/k;

    move-result-object v0

    invoke-virtual {v0}, Le/f/a/d/a/e/k;->b()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Le/f/a/d/a/e/m0;

    iget-object v1, p0, Le/f/a/d/a/b/g;->h:Le/f/a/d/a/b/q;

    invoke-static {v1}, Le/f/a/d/a/b/q;->a(Le/f/a/d/a/b/q;)Ljava/lang/String;

    move-result-object v1

    iget v2, p0, Le/f/a/d/a/b/g;->c:I

    iget-object v3, p0, Le/f/a/d/a/b/g;->d:Ljava/lang/String;

    iget-object v4, p0, Le/f/a/d/a/b/g;->e:Ljava/lang/String;

    iget v5, p0, Le/f/a/d/a/b/g;->f:I

    invoke-static {v2, v3, v4, v5}, Le/f/a/d/a/b/q;->c(ILjava/lang/String;Ljava/lang/String;I)Landroid/os/Bundle;

    move-result-object v2

    invoke-static {}, Le/f/a/d/a/b/q;->d()Landroid/os/Bundle;

    move-result-object v3

    new-instance v4, Le/f/a/d/a/b/l;

    iget-object v5, p0, Le/f/a/d/a/b/g;->h:Le/f/a/d/a/b/q;

    iget-object v6, p0, Le/f/a/d/a/b/g;->g:Le/f/a/d/a/i/o;

    const/4 v7, 0x0

    invoke-direct {v4, v5, v6, v7}, Le/f/a/d/a/b/l;-><init>(Le/f/a/d/a/b/q;Le/f/a/d/a/i/o;[C)V

    invoke-interface {v0, v1, v2, v3, v4}, Le/f/a/d/a/e/m0;->c(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;Le/f/a/d/a/e/o0;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    invoke-static {}, Le/f/a/d/a/b/q;->c()Le/f/a/d/a/e/a;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "notifyChunkTransferred"

    invoke-virtual {v1, v0, v3, v2}, Le/f/a/d/a/e/a;->a(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method
