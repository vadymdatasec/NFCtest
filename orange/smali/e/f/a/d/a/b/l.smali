.class public Le/f/a/d/a/b/l;
.super Le/f/a/d/a/e/n0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Le/f/a/d/a/e/n0;"
    }
.end annotation


# instance fields
.field public final a:Le/f/a/d/a/i/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/a/d/a/i/o<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final synthetic b:Le/f/a/d/a/b/q;


# direct methods
.method public constructor <init>(Le/f/a/d/a/b/q;Le/f/a/d/a/i/o;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/a/d/a/i/o<",
            "TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, Le/f/a/d/a/b/l;->b:Le/f/a/d/a/b/q;

    invoke-direct {p0}, Le/f/a/d/a/e/n0;-><init>()V

    iput-object p2, p0, Le/f/a/d/a/b/l;->a:Le/f/a/d/a/i/o;

    return-void
.end method

.method public constructor <init>(Le/f/a/d/a/b/q;Le/f/a/d/a/i/o;[B)V
    .locals 0

    invoke-direct {p0, p1, p2}, Le/f/a/d/a/b/l;-><init>(Le/f/a/d/a/b/q;Le/f/a/d/a/i/o;)V

    return-void
.end method

.method public constructor <init>(Le/f/a/d/a/b/q;Le/f/a/d/a/i/o;[C)V
    .locals 0

    invoke-direct {p0, p1, p2}, Le/f/a/d/a/b/l;-><init>(Le/f/a/d/a/b/q;Le/f/a/d/a/i/o;)V

    return-void
.end method

.method public constructor <init>(Le/f/a/d/a/b/q;Le/f/a/d/a/i/o;[I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Le/f/a/d/a/b/l;-><init>(Le/f/a/d/a/b/q;Le/f/a/d/a/i/o;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    iget-object v0, p0, Le/f/a/d/a/b/l;->b:Le/f/a/d/a/b/q;

    invoke-static {v0}, Le/f/a/d/a/b/q;->b(Le/f/a/d/a/b/q;)Le/f/a/d/a/e/k;

    move-result-object v0

    invoke-virtual {v0}, Le/f/a/d/a/e/k;->a()V

    invoke-static {}, Le/f/a/d/a/b/q;->c()Le/f/a/d/a/e/a;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onRemoveModule()"

    invoke-virtual {v0, v2, v1}, Le/f/a/d/a/e/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public final a(I)V
    .locals 3

    iget-object v0, p0, Le/f/a/d/a/b/l;->b:Le/f/a/d/a/b/q;

    invoke-static {v0}, Le/f/a/d/a/b/q;->b(Le/f/a/d/a/b/q;)Le/f/a/d/a/e/k;

    move-result-object v0

    invoke-virtual {v0}, Le/f/a/d/a/e/k;->a()V

    invoke-static {}, Le/f/a/d/a/b/q;->c()Le/f/a/d/a/e/a;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string p1, "onCancelDownload(%d)"

    invoke-virtual {v0, p1, v1}, Le/f/a/d/a/e/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public a(ILandroid/os/Bundle;)V
    .locals 2

    iget-object p2, p0, Le/f/a/d/a/b/l;->b:Le/f/a/d/a/b/q;

    invoke-static {p2}, Le/f/a/d/a/b/q;->b(Le/f/a/d/a/b/q;)Le/f/a/d/a/e/k;

    move-result-object p2

    invoke-virtual {p2}, Le/f/a/d/a/e/k;->a()V

    invoke-static {}, Le/f/a/d/a/b/q;->c()Le/f/a/d/a/e/a;

    move-result-object p2

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const-string p1, "onStartDownload(%d)"

    invoke-virtual {p2, p1, v0}, Le/f/a/d/a/e/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public a(Landroid/os/Bundle;)V
    .locals 4

    iget-object v0, p0, Le/f/a/d/a/b/l;->b:Le/f/a/d/a/b/q;

    invoke-static {v0}, Le/f/a/d/a/b/q;->b(Le/f/a/d/a/b/q;)Le/f/a/d/a/e/k;

    move-result-object v0

    invoke-virtual {v0}, Le/f/a/d/a/e/k;->a()V

    invoke-static {}, Le/f/a/d/a/b/q;->c()Le/f/a/d/a/e/a;

    move-result-object v0

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "module_name"

    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "slice_id"

    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "chunk_number"

    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const-string v2, "session_id"

    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v2, 0x3

    aput-object p1, v1, v2

    const-string p1, "onNotifyChunkTransferred(%s, %s, %d, session=%d)"

    invoke-virtual {v0, p1, v1}, Le/f/a/d/a/e/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public a(Landroid/os/Bundle;Landroid/os/Bundle;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object p1, p0, Le/f/a/d/a/b/l;->b:Le/f/a/d/a/b/q;

    invoke-static {p1}, Le/f/a/d/a/b/q;->b(Le/f/a/d/a/b/q;)Le/f/a/d/a/e/k;

    move-result-object p1

    invoke-virtual {p1}, Le/f/a/d/a/e/k;->a()V

    invoke-static {}, Le/f/a/d/a/b/q;->c()Le/f/a/d/a/e/a;

    move-result-object p1

    const/4 p2, 0x0

    new-array p2, p2, [Ljava/lang/Object;

    const-string v0, "onGetChunkFileDescriptor"

    invoke-virtual {p1, v0, p2}, Le/f/a/d/a/e/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public a(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/os/Bundle;",
            ">;)V"
        }
    .end annotation

    iget-object p1, p0, Le/f/a/d/a/b/l;->b:Le/f/a/d/a/b/q;

    invoke-static {p1}, Le/f/a/d/a/b/q;->b(Le/f/a/d/a/b/q;)Le/f/a/d/a/e/k;

    move-result-object p1

    invoke-virtual {p1}, Le/f/a/d/a/e/k;->a()V

    invoke-static {}, Le/f/a/d/a/b/q;->c()Le/f/a/d/a/e/a;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "onGetSessionStates"

    invoke-virtual {p1, v1, v0}, Le/f/a/d/a/e/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public final b(I)V
    .locals 3

    iget-object v0, p0, Le/f/a/d/a/b/l;->b:Le/f/a/d/a/b/q;

    invoke-static {v0}, Le/f/a/d/a/b/q;->b(Le/f/a/d/a/b/q;)Le/f/a/d/a/e/k;

    move-result-object v0

    invoke-virtual {v0}, Le/f/a/d/a/e/k;->a()V

    invoke-static {}, Le/f/a/d/a/b/q;->c()Le/f/a/d/a/e/a;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string p1, "onGetSession(%d)"

    invoke-virtual {v0, p1, v1}, Le/f/a/d/a/e/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public b(Landroid/os/Bundle;)V
    .locals 3

    iget-object v0, p0, Le/f/a/d/a/b/l;->b:Le/f/a/d/a/b/q;

    invoke-static {v0}, Le/f/a/d/a/b/q;->b(Le/f/a/d/a/b/q;)Le/f/a/d/a/e/k;

    move-result-object v0

    invoke-virtual {v0}, Le/f/a/d/a/e/k;->a()V

    invoke-static {}, Le/f/a/d/a/b/q;->c()Le/f/a/d/a/e/a;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "session_id"

    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string p1, "onNotifySessionFailed(%d)"

    invoke-virtual {v0, p1, v1}, Le/f/a/d/a/e/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public c(Landroid/os/Bundle;)V
    .locals 4

    iget-object v0, p0, Le/f/a/d/a/b/l;->b:Le/f/a/d/a/b/q;

    invoke-static {v0}, Le/f/a/d/a/b/q;->b(Le/f/a/d/a/b/q;)Le/f/a/d/a/e/k;

    move-result-object v0

    invoke-virtual {v0}, Le/f/a/d/a/e/k;->a()V

    const-string v0, "error_code"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result p1

    invoke-static {}, Le/f/a/d/a/b/q;->c()Le/f/a/d/a/e/a;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "onError(%d)"

    invoke-virtual {v0, v2, v1}, Le/f/a/d/a/e/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Le/f/a/d/a/b/l;->a:Le/f/a/d/a/i/o;

    new-instance v1, Lcom/google/android/play/core/assetpacks/AssetPackException;

    invoke-direct {v1, p1}, Lcom/google/android/play/core/assetpacks/AssetPackException;-><init>(I)V

    invoke-virtual {v0, v1}, Le/f/a/d/a/i/o;->b(Ljava/lang/Exception;)V

    return-void
.end method

.method public c(Landroid/os/Bundle;Landroid/os/Bundle;)V
    .locals 1

    iget-object p1, p0, Le/f/a/d/a/b/l;->b:Le/f/a/d/a/b/q;

    invoke-static {p1}, Le/f/a/d/a/b/q;->b(Le/f/a/d/a/b/q;)Le/f/a/d/a/e/k;

    move-result-object p1

    invoke-virtual {p1}, Le/f/a/d/a/e/k;->a()V

    invoke-static {}, Le/f/a/d/a/b/q;->c()Le/f/a/d/a/e/a;

    move-result-object p1

    const/4 p2, 0x0

    new-array p2, p2, [Ljava/lang/Object;

    const-string v0, "onRequestDownloadInfo()"

    invoke-virtual {p1, v0, p2}, Le/f/a/d/a/e/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public d()V
    .locals 3

    iget-object v0, p0, Le/f/a/d/a/b/l;->b:Le/f/a/d/a/b/q;

    invoke-static {v0}, Le/f/a/d/a/b/q;->b(Le/f/a/d/a/b/q;)Le/f/a/d/a/e/k;

    move-result-object v0

    invoke-virtual {v0}, Le/f/a/d/a/e/k;->a()V

    invoke-static {}, Le/f/a/d/a/b/q;->c()Le/f/a/d/a/e/a;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCancelDownloads()"

    invoke-virtual {v0, v2, v1}, Le/f/a/d/a/e/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public d(Landroid/os/Bundle;Landroid/os/Bundle;)V
    .locals 2

    iget-object p2, p0, Le/f/a/d/a/b/l;->b:Le/f/a/d/a/b/q;

    invoke-static {p2}, Le/f/a/d/a/b/q;->c(Le/f/a/d/a/b/q;)Le/f/a/d/a/e/k;

    move-result-object p2

    invoke-virtual {p2}, Le/f/a/d/a/e/k;->a()V

    invoke-static {}, Le/f/a/d/a/b/q;->c()Le/f/a/d/a/e/a;

    move-result-object p2

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "keep_alive"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const-string p1, "onKeepAlive(%b)"

    invoke-virtual {p2, p1, v0}, Le/f/a/d/a/e/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public f(Landroid/os/Bundle;)V
    .locals 4

    iget-object v0, p0, Le/f/a/d/a/b/l;->b:Le/f/a/d/a/b/q;

    invoke-static {v0}, Le/f/a/d/a/b/q;->b(Le/f/a/d/a/b/q;)Le/f/a/d/a/e/k;

    move-result-object v0

    invoke-virtual {v0}, Le/f/a/d/a/e/k;->a()V

    invoke-static {}, Le/f/a/d/a/b/q;->c()Le/f/a/d/a/e/a;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "module_name"

    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "session_id"

    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const-string p1, "onNotifyModuleCompleted(%s, sessionId=%d)"

    invoke-virtual {v0, p1, v1}, Le/f/a/d/a/e/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method
