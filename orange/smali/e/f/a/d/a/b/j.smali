.class public final Le/f/a/d/a/b/j;
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

    iput-object p1, p0, Le/f/a/d/a/b/j;->h:Le/f/a/d/a/b/q;

    iput p3, p0, Le/f/a/d/a/b/j;->c:I

    iput-object p4, p0, Le/f/a/d/a/b/j;->d:Ljava/lang/String;

    iput-object p5, p0, Le/f/a/d/a/b/j;->e:Ljava/lang/String;

    iput p6, p0, Le/f/a/d/a/b/j;->f:I

    iput-object p7, p0, Le/f/a/d/a/b/j;->g:Le/f/a/d/a/i/o;

    invoke-direct {p0, p2}, Le/f/a/d/a/e/b;-><init>(Le/f/a/d/a/i/o;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 7

    :try_start_0
    iget-object v0, p0, Le/f/a/d/a/b/j;->h:Le/f/a/d/a/b/q;

    invoke-static {v0}, Le/f/a/d/a/b/q;->b(Le/f/a/d/a/b/q;)Le/f/a/d/a/e/k;

    move-result-object v0

    invoke-virtual {v0}, Le/f/a/d/a/e/k;->b()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Le/f/a/d/a/e/m0;

    iget-object v1, p0, Le/f/a/d/a/b/j;->h:Le/f/a/d/a/b/q;

    invoke-static {v1}, Le/f/a/d/a/b/q;->a(Le/f/a/d/a/b/q;)Ljava/lang/String;

    move-result-object v1

    iget v2, p0, Le/f/a/d/a/b/j;->c:I

    iget-object v3, p0, Le/f/a/d/a/b/j;->d:Ljava/lang/String;

    iget-object v4, p0, Le/f/a/d/a/b/j;->e:Ljava/lang/String;

    iget v5, p0, Le/f/a/d/a/b/j;->f:I

    invoke-static {v2, v3, v4, v5}, Le/f/a/d/a/b/q;->c(ILjava/lang/String;Ljava/lang/String;I)Landroid/os/Bundle;

    move-result-object v2

    invoke-static {}, Le/f/a/d/a/b/q;->d()Landroid/os/Bundle;

    move-result-object v3

    new-instance v4, Le/f/a/d/a/b/m;

    iget-object v5, p0, Le/f/a/d/a/b/j;->h:Le/f/a/d/a/b/q;

    iget-object v6, p0, Le/f/a/d/a/b/j;->g:Le/f/a/d/a/i/o;

    invoke-direct {v4, v5, v6}, Le/f/a/d/a/b/m;-><init>(Le/f/a/d/a/b/q;Le/f/a/d/a/i/o;)V

    invoke-interface {v0, v1, v2, v3, v4}, Le/f/a/d/a/e/m0;->b(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;Le/f/a/d/a/e/o0;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    invoke-static {}, Le/f/a/d/a/b/q;->c()Le/f/a/d/a/e/a;

    move-result-object v1

    const/4 v2, 0x4

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-object v4, p0, Le/f/a/d/a/b/j;->d:Ljava/lang/String;

    aput-object v4, v2, v3

    const/4 v3, 0x1

    iget-object v4, p0, Le/f/a/d/a/b/j;->e:Ljava/lang/String;

    aput-object v4, v2, v3

    const/4 v3, 0x2

    iget v4, p0, Le/f/a/d/a/b/j;->f:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x3

    iget v4, p0, Le/f/a/d/a/b/j;->c:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    const-string v3, "getChunkFileDescriptor(%s, %s, %d, session=%d)"

    invoke-virtual {v1, v3, v2}, Le/f/a/d/a/e/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v1, p0, Le/f/a/d/a/b/j;->g:Le/f/a/d/a/i/o;

    new-instance v2, Ljava/lang/RuntimeException;

    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {v1, v2}, Le/f/a/d/a/i/o;->b(Ljava/lang/Exception;)V

    return-void
.end method
