.class public final Lc/b/q/s;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Landroid/graphics/PorterDuff$Mode;

.field public static c:Lc/b/q/s;


# instance fields
.field public a:Lc/b/q/z1;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    sput-object v0, Lc/b/q/s;->b:Landroid/graphics/PorterDuff$Mode;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    .line 1
    sget-object v0, Lc/b/q/s;->b:Landroid/graphics/PorterDuff$Mode;

    return-object v0
.end method

.method public static declared-synchronized a(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;
    .locals 1

    const-class v0, Lc/b/q/s;

    monitor-enter v0

    .line 7
    :try_start_0
    invoke-static {p0, p1}, Lc/b/q/z1;->a(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static a(Landroid/graphics/drawable/Drawable;Lc/b/q/i2;[I)V
    .locals 0

    .line 6
    invoke-static {p0, p1, p2}, Lc/b/q/z1;->a(Landroid/graphics/drawable/Drawable;Lc/b/q/i2;[I)V

    return-void
.end method

.method public static declared-synchronized b()Lc/b/q/s;
    .locals 2

    const-class v0, Lc/b/q/s;

    monitor-enter v0

    .line 1
    :try_start_0
    sget-object v1, Lc/b/q/s;->c:Lc/b/q/s;

    if-nez v1, :cond_0

    .line 2
    invoke-static {}, Lc/b/q/s;->c()V

    .line 3
    :cond_0
    sget-object v1, Lc/b/q/s;->c:Lc/b/q/s;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public static declared-synchronized c()V
    .locals 3

    const-class v0, Lc/b/q/s;

    monitor-enter v0

    .line 1
    :try_start_0
    sget-object v1, Lc/b/q/s;->c:Lc/b/q/s;

    if-nez v1, :cond_0

    .line 2
    new-instance v1, Lc/b/q/s;

    invoke-direct {v1}, Lc/b/q/s;-><init>()V

    sput-object v1, Lc/b/q/s;->c:Lc/b/q/s;

    .line 3
    invoke-static {}, Lc/b/q/z1;->a()Lc/b/q/z1;

    move-result-object v2

    iput-object v2, v1, Lc/b/q/s;->a:Lc/b/q/z1;

    .line 4
    sget-object v1, Lc/b/q/s;->c:Lc/b/q/s;

    iget-object v1, v1, Lc/b/q/s;->a:Lc/b/q/z1;

    new-instance v2, Lc/b/q/r;

    invoke-direct {v2}, Lc/b/q/r;-><init>()V

    invoke-virtual {v1, v2}, Lc/b/q/z1;->a(Lc/b/q/x1;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method


# virtual methods
.method public declared-synchronized a(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    .locals 1

    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lc/b/q/s;->a:Lc/b/q/z1;

    invoke-virtual {v0, p1, p2}, Lc/b/q/z1;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized a(Landroid/content/Context;IZ)Landroid/graphics/drawable/Drawable;
    .locals 1

    monitor-enter p0

    .line 3
    :try_start_0
    iget-object v0, p0, Lc/b/q/s;->a:Lc/b/q/z1;

    invoke-virtual {v0, p1, p2, p3}, Lc/b/q/z1;->a(Landroid/content/Context;IZ)Landroid/graphics/drawable/Drawable;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized a(Landroid/content/Context;)V
    .locals 1

    monitor-enter p0

    .line 4
    :try_start_0
    iget-object v0, p0, Lc/b/q/s;->a:Lc/b/q/z1;

    invoke-virtual {v0, p1}, Lc/b/q/z1;->b(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized b(Landroid/content/Context;I)Landroid/content/res/ColorStateList;
    .locals 1

    monitor-enter p0

    .line 4
    :try_start_0
    iget-object v0, p0, Lc/b/q/s;->a:Lc/b/q/z1;

    invoke-virtual {v0, p1, p2}, Lc/b/q/z1;->c(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
