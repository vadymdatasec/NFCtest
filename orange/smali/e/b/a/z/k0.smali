.class public final Le/b/a/z/k0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static volatile d:Le/b/a/z/k0;


# instance fields
.field public final a:Le/b/a/z/a0;

.field public final b:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Le/b/a/z/c;",
            ">;"
        }
    .end annotation
.end field

.field public c:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Le/b/a/z/k0;->b:Ljava/util/Set;

    .line 3
    new-instance v0, Le/b/a/z/y;

    invoke-direct {v0, p0, p1}, Le/b/a/z/y;-><init>(Le/b/a/z/k0;Landroid/content/Context;)V

    .line 4
    invoke-static {v0}, Le/b/a/e0/l;->a(Le/b/a/e0/k;)Le/b/a/e0/k;

    move-result-object v0

    .line 5
    new-instance v1, Le/b/a/z/z;

    invoke-direct {v1, p0}, Le/b/a/z/z;-><init>(Le/b/a/z/k0;)V

    .line 6
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x18

    if-lt v2, v3, :cond_0

    .line 7
    new-instance p1, Le/b/a/z/d0;

    invoke-direct {p1, v0, v1}, Le/b/a/z/d0;-><init>(Le/b/a/e0/k;Le/b/a/z/c;)V

    goto :goto_0

    .line 8
    :cond_0
    new-instance v2, Le/b/a/z/j0;

    invoke-direct {v2, p1, v0, v1}, Le/b/a/z/j0;-><init>(Landroid/content/Context;Le/b/a/e0/k;Le/b/a/z/c;)V

    move-object p1, v2

    :goto_0
    iput-object p1, p0, Le/b/a/z/k0;->a:Le/b/a/z/a0;

    return-void
.end method

.method public static a(Landroid/content/Context;)Le/b/a/z/k0;
    .locals 2

    .line 1
    sget-object v0, Le/b/a/z/k0;->d:Le/b/a/z/k0;

    if-nez v0, :cond_1

    .line 2
    const-class v0, Le/b/a/z/k0;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Le/b/a/z/k0;->d:Le/b/a/z/k0;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Le/b/a/z/k0;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-direct {v1, p0}, Le/b/a/z/k0;-><init>(Landroid/content/Context;)V

    sput-object v1, Le/b/a/z/k0;->d:Le/b/a/z/k0;

    .line 5
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    .line 6
    :cond_1
    :goto_0
    sget-object p0, Le/b/a/z/k0;->d:Le/b/a/z/k0;

    return-object p0
.end method


# virtual methods
.method public final a()V
    .locals 1

    .line 10
    iget-boolean v0, p0, Le/b/a/z/k0;->c:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Le/b/a/z/k0;->b:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 11
    :cond_0
    iget-object v0, p0, Le/b/a/z/k0;->a:Le/b/a/z/a0;

    invoke-interface {v0}, Le/b/a/z/a0;->b()Z

    move-result v0

    iput-boolean v0, p0, Le/b/a/z/k0;->c:Z

    :cond_1
    :goto_0
    return-void
.end method

.method public declared-synchronized a(Le/b/a/z/c;)V
    .locals 1

    monitor-enter p0

    .line 7
    :try_start_0
    iget-object v0, p0, Le/b/a/z/k0;->b:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 8
    invoke-virtual {p0}, Le/b/a/z/k0;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final b()V
    .locals 1

    .line 4
    iget-boolean v0, p0, Le/b/a/z/k0;->c:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Le/b/a/z/k0;->b:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 5
    :cond_0
    iget-object v0, p0, Le/b/a/z/k0;->a:Le/b/a/z/a0;

    invoke-interface {v0}, Le/b/a/z/a0;->a()V

    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Le/b/a/z/k0;->c:Z

    :cond_1
    :goto_0
    return-void
.end method

.method public declared-synchronized b(Le/b/a/z/c;)V
    .locals 1

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Le/b/a/z/k0;->b:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 2
    invoke-virtual {p0}, Le/b/a/z/k0;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
