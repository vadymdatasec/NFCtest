.class public final Le/f/a/d/a/b/f;
.super Le/f/a/d/a/e/b;
.source "SourceFile"


# instance fields
.field public final synthetic c:Ljava/util/Map;

.field public final synthetic d:Le/f/a/d/a/i/o;

.field public final synthetic e:Le/f/a/d/a/b/q;


# direct methods
.method public constructor <init>(Le/f/a/d/a/b/q;Le/f/a/d/a/i/o;Ljava/util/Map;Le/f/a/d/a/i/o;)V
    .locals 0

    iput-object p1, p0, Le/f/a/d/a/b/f;->e:Le/f/a/d/a/b/q;

    iput-object p3, p0, Le/f/a/d/a/b/f;->c:Ljava/util/Map;

    iput-object p4, p0, Le/f/a/d/a/b/f;->d:Le/f/a/d/a/i/o;

    invoke-direct {p0, p2}, Le/f/a/d/a/e/b;-><init>(Le/f/a/d/a/i/o;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 6

    :try_start_0
    iget-object v0, p0, Le/f/a/d/a/b/f;->e:Le/f/a/d/a/b/q;

    invoke-static {v0}, Le/f/a/d/a/b/q;->b(Le/f/a/d/a/b/q;)Le/f/a/d/a/e/k;

    move-result-object v0

    invoke-virtual {v0}, Le/f/a/d/a/e/k;->b()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Le/f/a/d/a/e/m0;

    iget-object v1, p0, Le/f/a/d/a/b/f;->e:Le/f/a/d/a/b/q;

    invoke-static {v1}, Le/f/a/d/a/b/q;->a(Le/f/a/d/a/b/q;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Le/f/a/d/a/b/f;->c:Ljava/util/Map;

    invoke-static {v2}, Le/f/a/d/a/b/q;->b(Ljava/util/Map;)Landroid/os/Bundle;

    move-result-object v2

    new-instance v3, Le/f/a/d/a/b/n;

    iget-object v4, p0, Le/f/a/d/a/b/f;->e:Le/f/a/d/a/b/q;

    iget-object v5, p0, Le/f/a/d/a/b/f;->d:Le/f/a/d/a/i/o;

    invoke-direct {v3, v4, v5}, Le/f/a/d/a/b/n;-><init>(Le/f/a/d/a/b/q;Le/f/a/d/a/i/o;)V

    invoke-interface {v0, v1, v2, v3}, Le/f/a/d/a/e/m0;->a(Ljava/lang/String;Landroid/os/Bundle;Le/f/a/d/a/e/o0;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    invoke-static {}, Le/f/a/d/a/b/q;->c()Le/f/a/d/a/e/a;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "syncPacks"

    invoke-virtual {v1, v0, v3, v2}, Le/f/a/d/a/e/a;->a(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v1, p0, Le/f/a/d/a/b/f;->d:Le/f/a/d/a/i/o;

    new-instance v2, Ljava/lang/RuntimeException;

    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {v1, v2}, Le/f/a/d/a/i/o;->b(Ljava/lang/Exception;)V

    return-void
.end method
