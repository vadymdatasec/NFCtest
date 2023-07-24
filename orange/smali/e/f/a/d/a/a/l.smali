.class public final Le/f/a/d/a/a/l;
.super Le/f/a/d/a/e/b;
.source "SourceFile"


# instance fields
.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Le/f/a/d/a/i/o;

.field public final synthetic e:Le/f/a/d/a/a/o;


# direct methods
.method public constructor <init>(Le/f/a/d/a/a/o;Le/f/a/d/a/i/o;Ljava/lang/String;Le/f/a/d/a/i/o;)V
    .locals 0

    iput-object p1, p0, Le/f/a/d/a/a/l;->e:Le/f/a/d/a/a/o;

    iput-object p3, p0, Le/f/a/d/a/a/l;->c:Ljava/lang/String;

    iput-object p4, p0, Le/f/a/d/a/a/l;->d:Le/f/a/d/a/i/o;

    invoke-direct {p0, p2}, Le/f/a/d/a/e/b;-><init>(Le/f/a/d/a/i/o;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 7

    :try_start_0
    iget-object v0, p0, Le/f/a/d/a/a/l;->e:Le/f/a/d/a/a/o;

    iget-object v0, v0, Le/f/a/d/a/a/o;->a:Le/f/a/d/a/e/k;

    invoke-virtual {v0}, Le/f/a/d/a/e/k;->b()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Le/f/a/d/a/e/h0;

    iget-object v1, p0, Le/f/a/d/a/a/l;->e:Le/f/a/d/a/a/o;

    invoke-static {v1}, Le/f/a/d/a/a/o;->a(Le/f/a/d/a/a/o;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Le/f/a/d/a/a/l;->e:Le/f/a/d/a/a/o;

    iget-object v3, p0, Le/f/a/d/a/a/l;->c:Ljava/lang/String;

    invoke-static {v2, v3}, Le/f/a/d/a/a/o;->a(Le/f/a/d/a/a/o;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v2

    new-instance v3, Le/f/a/d/a/a/n;

    iget-object v4, p0, Le/f/a/d/a/a/l;->e:Le/f/a/d/a/a/o;

    iget-object v5, p0, Le/f/a/d/a/a/l;->d:Le/f/a/d/a/i/o;

    iget-object v6, p0, Le/f/a/d/a/a/l;->c:Ljava/lang/String;

    invoke-direct {v3, v4, v5, v6}, Le/f/a/d/a/a/n;-><init>(Le/f/a/d/a/a/o;Le/f/a/d/a/i/o;Ljava/lang/String;)V

    invoke-interface {v0, v1, v2, v3}, Le/f/a/d/a/e/h0;->a(Ljava/lang/String;Landroid/os/Bundle;Le/f/a/d/a/e/j0;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    invoke-static {}, Le/f/a/d/a/a/o;->a()Le/f/a/d/a/e/a;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-object v4, p0, Le/f/a/d/a/a/l;->c:Ljava/lang/String;

    aput-object v4, v2, v3

    const-string v3, "requestUpdateInfo(%s)"

    invoke-virtual {v1, v0, v3, v2}, Le/f/a/d/a/e/a;->a(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v1, p0, Le/f/a/d/a/a/l;->d:Le/f/a/d/a/i/o;

    new-instance v2, Ljava/lang/RuntimeException;

    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {v1, v2}, Le/f/a/d/a/i/o;->b(Ljava/lang/Exception;)V

    return-void
.end method
