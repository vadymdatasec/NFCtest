.class public final Le/f/a/d/a/b/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/a/d/a/b/j3;


# static fields
.field public static final f:Le/f/a/d/a/e/a;

.field public static final g:Landroid/content/Intent;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Le/f/a/d/a/b/x0;

.field public c:Le/f/a/d/a/e/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/a/d/a/e/k<",
            "Le/f/a/d/a/e/m0;",
            ">;"
        }
    .end annotation
.end field

.field public d:Le/f/a/d/a/e/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/a/d/a/e/k<",
            "Le/f/a/d/a/e/m0;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Le/f/a/d/a/e/a;

    const-string v1, "AssetPackServiceImpl"

    invoke-direct {v0, v1}, Le/f/a/d/a/e/a;-><init>(Ljava/lang/String;)V

    sput-object v0, Le/f/a/d/a/b/q;->f:Le/f/a/d/a/e/a;

    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.google.android.play.core.assetmoduleservice.BIND_ASSET_MODULE_SERVICE"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "com.android.vending"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    sput-object v0, Le/f/a/d/a/b/q;->g:Landroid/content/Intent;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Le/f/a/d/a/b/x0;)V
    .locals 12

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v0, p0, Le/f/a/d/a/b/q;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Le/f/a/d/a/b/q;->a:Ljava/lang/String;

    iput-object p2, p0, Le/f/a/d/a/b/q;->b:Le/f/a/d/a/b/x0;

    invoke-static {p1}, Le/f/a/d/a/e/n;->a(Landroid/content/Context;)Z

    move-result p2

    if-eqz p2, :cond_0

    new-instance p2, Le/f/a/d/a/e/k;

    invoke-static {p1}, Le/f/a/d/a/g/a;->a(Landroid/content/Context;)Landroid/content/Context;

    move-result-object v1

    sget-object v2, Le/f/a/d/a/b/q;->f:Le/f/a/d/a/e/a;

    sget-object v4, Le/f/a/d/a/b/q;->g:Landroid/content/Intent;

    sget-object v5, Le/f/a/d/a/b/k3;->a:Le/f/a/d/a/e/g;

    const-string v3, "AssetPackService"

    move-object v0, p2

    invoke-direct/range {v0 .. v5}, Le/f/a/d/a/e/k;-><init>(Landroid/content/Context;Le/f/a/d/a/e/a;Ljava/lang/String;Landroid/content/Intent;Le/f/a/d/a/e/g;)V

    iput-object p2, p0, Le/f/a/d/a/b/q;->c:Le/f/a/d/a/e/k;

    new-instance p2, Le/f/a/d/a/e/k;

    invoke-static {p1}, Le/f/a/d/a/g/a;->a(Landroid/content/Context;)Landroid/content/Context;

    move-result-object v7

    sget-object v8, Le/f/a/d/a/b/q;->f:Le/f/a/d/a/e/a;

    sget-object v10, Le/f/a/d/a/b/q;->g:Landroid/content/Intent;

    sget-object v11, Le/f/a/d/a/b/l3;->a:Le/f/a/d/a/e/g;

    const-string v9, "AssetPackService-keepAlive"

    move-object v6, p2

    invoke-direct/range {v6 .. v11}, Le/f/a/d/a/e/k;-><init>(Landroid/content/Context;Le/f/a/d/a/e/a;Ljava/lang/String;Landroid/content/Intent;Le/f/a/d/a/e/g;)V

    iput-object p2, p0, Le/f/a/d/a/b/q;->d:Le/f/a/d/a/e/k;

    :cond_0
    sget-object p1, Le/f/a/d/a/b/q;->f:Le/f/a/d/a/e/a;

    const/4 p2, 0x0

    new-array p2, p2, [Ljava/lang/Object;

    const-string v0, "AssetPackService initiated."

    invoke-virtual {p1, v0, p2}, Le/f/a/d/a/e/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic a(Le/f/a/d/a/b/q;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Le/f/a/d/a/b/q;->a:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic a(Ljava/util/Collection;)Ljava/util/ArrayList;
    .locals 4

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    const-string v3, "module_name"

    invoke-virtual {v2, v3, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static synthetic a(Le/f/a/d/a/b/q;Ljava/util/List;)Ljava/util/List;
    .locals 5

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/Bundle;

    iget-object v2, p0, Le/f/a/d/a/b/q;->b:Le/f/a/d/a/b/x0;

    invoke-static {v1, v2}, Le/f/a/d/a/b/c;->a(Landroid/os/Bundle;Le/f/a/d/a/b/x0;)Le/f/a/d/a/b/c;

    move-result-object v1

    invoke-virtual {v1}, Le/f/a/d/a/b/c;->a()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le/f/a/d/a/b/b;

    if-nez v1, :cond_1

    sget-object v2, Le/f/a/d/a/b/q;->f:Le/f/a/d/a/e/a;

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "onGetSessionStates: Bundle contained no pack."

    invoke-virtual {v2, v4, v3}, Le/f/a/d/a/e/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    invoke-virtual {v1}, Le/f/a/d/a/b/b;->e()I

    move-result v2

    invoke-static {v2}, Le/f/a/d/a/b/v1;->a(I)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Le/f/a/d/a/b/b;->d()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public static synthetic a(Le/f/a/d/a/b/q;ILjava/lang/String;I)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Le/f/a/d/a/b/q;->a(ILjava/lang/String;I)V

    return-void
.end method

.method public static b()Landroid/os/Bundle;
    .locals 3

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "playcore_version_code"

    const/16 v2, 0x2a33

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v2, "supported_compression_formats"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putIntegerArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const-string v2, "supported_patch_formats"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putIntegerArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    return-object v0
.end method

.method public static b(I)Landroid/os/Bundle;
    .locals 2

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "session_id"

    invoke-virtual {v0, v1, p0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    return-object v0
.end method

.method public static b(ILjava/lang/String;)Landroid/os/Bundle;
    .locals 1

    invoke-static {p0}, Le/f/a/d/a/b/q;->b(I)Landroid/os/Bundle;

    move-result-object p0

    const-string v0, "module_name"

    invoke-virtual {p0, v0, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method

.method public static synthetic b(Ljava/util/Map;)Landroid/os/Bundle;
    .locals 6

    invoke-static {}, Le/f/a/d/a/b/q;->b()Landroid/os/Bundle;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    const-string v5, "installed_asset_module_name"

    invoke-virtual {v3, v5, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    const-string v2, "installed_asset_module_version"

    invoke-virtual {v3, v2, v4, v5}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    const-string p0, "installed_asset_module"

    invoke-virtual {v0, p0, v1}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    return-object v0
.end method

.method public static synthetic b(Le/f/a/d/a/b/q;)Le/f/a/d/a/e/k;
    .locals 0

    iget-object p0, p0, Le/f/a/d/a/b/q;->c:Le/f/a/d/a/e/k;

    return-object p0
.end method

.method public static synthetic c(I)Landroid/os/Bundle;
    .locals 0

    invoke-static {p0}, Le/f/a/d/a/b/q;->b(I)Landroid/os/Bundle;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(ILjava/lang/String;)Landroid/os/Bundle;
    .locals 0

    invoke-static {p0, p1}, Le/f/a/d/a/b/q;->b(ILjava/lang/String;)Landroid/os/Bundle;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(ILjava/lang/String;Ljava/lang/String;I)Landroid/os/Bundle;
    .locals 0

    invoke-static {p0, p1}, Le/f/a/d/a/b/q;->b(ILjava/lang/String;)Landroid/os/Bundle;

    move-result-object p0

    const-string p1, "slice_id"

    invoke-virtual {p0, p1, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "chunk_number"

    invoke-virtual {p0, p1, p3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    return-object p0
.end method

.method public static synthetic c()Le/f/a/d/a/e/a;
    .locals 1

    sget-object v0, Le/f/a/d/a/b/q;->f:Le/f/a/d/a/e/a;

    return-object v0
.end method

.method public static synthetic c(Le/f/a/d/a/b/q;)Le/f/a/d/a/e/k;
    .locals 0

    iget-object p0, p0, Le/f/a/d/a/b/q;->d:Le/f/a/d/a/e/k;

    return-object p0
.end method

.method public static synthetic d()Landroid/os/Bundle;
    .locals 1

    invoke-static {}, Le/f/a/d/a/b/q;->b()Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d(Le/f/a/d/a/b/q;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 0

    iget-object p0, p0, Le/f/a/d/a/b/q;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object p0
.end method

.method public static e()Le/f/a/d/a/i/d;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Le/f/a/d/a/i/d<",
            "TT;>;"
        }
    .end annotation

    sget-object v0, Le/f/a/d/a/b/q;->f:Le/f/a/d/a/e/a;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/16 v2, -0xb

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v1, v4

    const-string v3, "onError(%d)"

    invoke-virtual {v0, v3, v1}, Le/f/a/d/a/e/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v0, Lcom/google/android/play/core/assetpacks/AssetPackException;

    invoke-direct {v0, v2}, Lcom/google/android/play/core/assetpacks/AssetPackException;-><init>(I)V

    invoke-static {v0}, Le/f/a/d/a/i/f;->a(Ljava/lang/Exception;)Le/f/a/d/a/i/d;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final a(ILjava/lang/String;Ljava/lang/String;I)Le/f/a/d/a/i/d;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I)",
            "Le/f/a/d/a/i/d<",
            "Landroid/os/ParcelFileDescriptor;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Le/f/a/d/a/b/q;->c:Le/f/a/d/a/e/k;

    if-nez v0, :cond_0

    invoke-static {}, Le/f/a/d/a/b/q;->e()Le/f/a/d/a/i/d;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object v0, Le/f/a/d/a/b/q;->f:Le/f/a/d/a/e/a;

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p2, v1, v2

    const/4 v2, 0x1

    aput-object p3, v1, v2

    const/4 v2, 0x2

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    const-string v2, "getChunkFileDescriptor(%s, %s, %d, session=%d)"

    invoke-virtual {v0, v2, v1}, Le/f/a/d/a/e/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v0, Le/f/a/d/a/i/o;

    invoke-direct {v0}, Le/f/a/d/a/i/o;-><init>()V

    iget-object v1, p0, Le/f/a/d/a/b/q;->c:Le/f/a/d/a/e/k;

    new-instance v2, Le/f/a/d/a/b/j;

    move-object v3, v2

    move-object v4, p0

    move-object v5, v0

    move v6, p1

    move-object v7, p2

    move-object v8, p3

    move v9, p4

    move-object v10, v0

    invoke-direct/range {v3 .. v10}, Le/f/a/d/a/b/j;-><init>(Le/f/a/d/a/b/q;Le/f/a/d/a/i/o;ILjava/lang/String;Ljava/lang/String;ILe/f/a/d/a/i/o;)V

    invoke-virtual {v1, v2}, Le/f/a/d/a/e/k;->a(Le/f/a/d/a/e/b;)V

    invoke-virtual {v0}, Le/f/a/d/a/i/o;->a()Le/f/a/d/a/i/d;

    move-result-object p1

    return-object p1
.end method

.method public final a(Ljava/util/Map;)Le/f/a/d/a/i/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            ">;)",
            "Le/f/a/d/a/i/d<",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Le/f/a/d/a/b/q;->c:Le/f/a/d/a/e/k;

    if-nez v0, :cond_0

    invoke-static {}, Le/f/a/d/a/b/q;->e()Le/f/a/d/a/i/d;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object v0, Le/f/a/d/a/b/q;->f:Le/f/a/d/a/e/a;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "syncPacks"

    invoke-virtual {v0, v2, v1}, Le/f/a/d/a/e/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v0, Le/f/a/d/a/i/o;

    invoke-direct {v0}, Le/f/a/d/a/i/o;-><init>()V

    iget-object v1, p0, Le/f/a/d/a/b/q;->c:Le/f/a/d/a/e/k;

    new-instance v2, Le/f/a/d/a/b/f;

    invoke-direct {v2, p0, v0, p1, v0}, Le/f/a/d/a/b/f;-><init>(Le/f/a/d/a/b/q;Le/f/a/d/a/i/o;Ljava/util/Map;Le/f/a/d/a/i/o;)V

    invoke-virtual {v1, v2}, Le/f/a/d/a/e/k;->a(Le/f/a/d/a/e/b;)V

    invoke-virtual {v0}, Le/f/a/d/a/i/o;->a()Le/f/a/d/a/i/d;

    move-result-object p1

    return-object p1
.end method

.method public final declared-synchronized a()V
    .locals 4

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Le/f/a/d/a/b/q;->d:Le/f/a/d/a/e/k;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    sget-object v0, Le/f/a/d/a/b/q;->f:Le/f/a/d/a/e/a;

    const-string v2, "Keep alive connection manager is not initialized."

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, v2, v1}, Le/f/a/d/a/e/a;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    sget-object v0, Le/f/a/d/a/b/q;->f:Le/f/a/d/a/e/a;

    const-string v2, "keepAlive"

    new-array v3, v1, [Ljava/lang/Object;

    invoke-virtual {v0, v2, v3}, Le/f/a/d/a/e/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Le/f/a/d/a/b/q;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Le/f/a/d/a/b/q;->f:Le/f/a/d/a/e/a;

    const-string v2, "Service is already kept alive."

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, v2, v1}, Le/f/a/d/a/e/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :cond_1
    :try_start_2
    new-instance v0, Le/f/a/d/a/i/o;

    invoke-direct {v0}, Le/f/a/d/a/i/o;-><init>()V

    iget-object v1, p0, Le/f/a/d/a/b/q;->d:Le/f/a/d/a/e/k;

    new-instance v2, Le/f/a/d/a/b/k;

    invoke-direct {v2, p0, v0, v0}, Le/f/a/d/a/b/k;-><init>(Le/f/a/d/a/b/q;Le/f/a/d/a/i/o;Le/f/a/d/a/i/o;)V

    invoke-virtual {v1, v2}, Le/f/a/d/a/e/k;->a(Le/f/a/d/a/e/b;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final a(I)V
    .locals 3

    iget-object v0, p0, Le/f/a/d/a/b/q;->c:Le/f/a/d/a/e/k;

    if-eqz v0, :cond_0

    sget-object v0, Le/f/a/d/a/b/q;->f:Le/f/a/d/a/e/a;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "notifySessionFailed"

    invoke-virtual {v0, v2, v1}, Le/f/a/d/a/e/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v0, Le/f/a/d/a/i/o;

    invoke-direct {v0}, Le/f/a/d/a/i/o;-><init>()V

    iget-object v1, p0, Le/f/a/d/a/b/q;->c:Le/f/a/d/a/e/k;

    new-instance v2, Le/f/a/d/a/b/i;

    invoke-direct {v2, p0, v0, p1, v0}, Le/f/a/d/a/b/i;-><init>(Le/f/a/d/a/b/q;Le/f/a/d/a/i/o;ILe/f/a/d/a/i/o;)V

    invoke-virtual {v1, v2}, Le/f/a/d/a/e/k;->a(Le/f/a/d/a/e/b;)V

    return-void

    :cond_0
    new-instance v0, Le/f/a/d/a/b/t0;

    const-string v1, "The Play Store app is not installed or is an unofficial version."

    invoke-direct {v0, v1, p1}, Le/f/a/d/a/b/t0;-><init>(Ljava/lang/String;I)V

    throw v0
.end method

.method public final a(ILjava/lang/String;)V
    .locals 1

    const/16 v0, 0xa

    invoke-virtual {p0, p1, p2, v0}, Le/f/a/d/a/b/q;->a(ILjava/lang/String;I)V

    return-void
.end method

.method public final a(ILjava/lang/String;I)V
    .locals 10

    iget-object v0, p0, Le/f/a/d/a/b/q;->c:Le/f/a/d/a/e/k;

    if-eqz v0, :cond_0

    sget-object v0, Le/f/a/d/a/b/q;->f:Le/f/a/d/a/e/a;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "notifyModuleCompleted"

    invoke-virtual {v0, v2, v1}, Le/f/a/d/a/e/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v8, Le/f/a/d/a/i/o;

    invoke-direct {v8}, Le/f/a/d/a/i/o;-><init>()V

    iget-object v0, p0, Le/f/a/d/a/b/q;->c:Le/f/a/d/a/e/k;

    new-instance v1, Le/f/a/d/a/b/h;

    move-object v3, v1

    move-object v4, p0

    move-object v5, v8

    move v6, p1

    move-object v7, p2

    move v9, p3

    invoke-direct/range {v3 .. v9}, Le/f/a/d/a/b/h;-><init>(Le/f/a/d/a/b/q;Le/f/a/d/a/i/o;ILjava/lang/String;Le/f/a/d/a/i/o;I)V

    invoke-virtual {v0, v1}, Le/f/a/d/a/e/k;->a(Le/f/a/d/a/e/b;)V

    return-void

    :cond_0
    new-instance p2, Le/f/a/d/a/b/t0;

    const-string p3, "The Play Store app is not installed or is an unofficial version."

    invoke-direct {p2, p3, p1}, Le/f/a/d/a/b/t0;-><init>(Ljava/lang/String;I)V

    throw p2
.end method

.method public final a(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Le/f/a/d/a/b/q;->c:Le/f/a/d/a/e/k;

    if-nez v0, :cond_0

    return-void

    :cond_0
    sget-object v0, Le/f/a/d/a/b/q;->f:Le/f/a/d/a/e/a;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string v2, "cancelDownloads(%s)"

    invoke-virtual {v0, v2, v1}, Le/f/a/d/a/e/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v0, Le/f/a/d/a/i/o;

    invoke-direct {v0}, Le/f/a/d/a/i/o;-><init>()V

    iget-object v1, p0, Le/f/a/d/a/b/q;->c:Le/f/a/d/a/e/k;

    new-instance v2, Le/f/a/d/a/b/e;

    invoke-direct {v2, p0, v0, p1, v0}, Le/f/a/d/a/b/e;-><init>(Le/f/a/d/a/b/q;Le/f/a/d/a/i/o;Ljava/util/List;Le/f/a/d/a/i/o;)V

    invoke-virtual {v1, v2}, Le/f/a/d/a/e/k;->a(Le/f/a/d/a/e/b;)V

    return-void
.end method

.method public final b(ILjava/lang/String;Ljava/lang/String;I)V
    .locals 11

    iget-object v0, p0, Le/f/a/d/a/b/q;->c:Le/f/a/d/a/e/k;

    if-eqz v0, :cond_0

    sget-object v0, Le/f/a/d/a/b/q;->f:Le/f/a/d/a/e/a;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "notifyChunkTransferred"

    invoke-virtual {v0, v2, v1}, Le/f/a/d/a/e/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v10, Le/f/a/d/a/i/o;

    invoke-direct {v10}, Le/f/a/d/a/i/o;-><init>()V

    iget-object v0, p0, Le/f/a/d/a/b/q;->c:Le/f/a/d/a/e/k;

    new-instance v1, Le/f/a/d/a/b/g;

    move-object v3, v1

    move-object v4, p0

    move-object v5, v10

    move v6, p1

    move-object v7, p2

    move-object v8, p3

    move v9, p4

    invoke-direct/range {v3 .. v10}, Le/f/a/d/a/b/g;-><init>(Le/f/a/d/a/b/q;Le/f/a/d/a/i/o;ILjava/lang/String;Ljava/lang/String;ILe/f/a/d/a/i/o;)V

    invoke-virtual {v0, v1}, Le/f/a/d/a/e/k;->a(Le/f/a/d/a/e/b;)V

    return-void

    :cond_0
    new-instance p2, Le/f/a/d/a/b/t0;

    const-string p3, "The Play Store app is not installed or is an unofficial version."

    invoke-direct {p2, p3, p1}, Le/f/a/d/a/b/t0;-><init>(Ljava/lang/String;I)V

    throw p2
.end method
