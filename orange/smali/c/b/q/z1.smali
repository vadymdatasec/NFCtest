.class public final Lc/b/q/z1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final h:Landroid/graphics/PorterDuff$Mode;

.field public static i:Lc/b/q/z1;

.field public static final j:Lc/b/q/v1;


# instance fields
.field public a:Ljava/util/WeakHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/WeakHashMap<",
            "Landroid/content/Context;",
            "Lc/e/j<",
            "Landroid/content/res/ColorStateList;",
            ">;>;"
        }
    .end annotation
.end field

.field public b:Lc/e/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/e/b<",
            "Ljava/lang/String;",
            "Lc/b/q/w1;",
            ">;"
        }
    .end annotation
.end field

.field public c:Lc/e/j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/e/j<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Ljava/util/WeakHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/WeakHashMap<",
            "Landroid/content/Context;",
            "Lc/e/f<",
            "Ljava/lang/ref/WeakReference<",
            "Landroid/graphics/drawable/Drawable$ConstantState;",
            ">;>;>;"
        }
    .end annotation
.end field

.field public e:Landroid/util/TypedValue;

.field public f:Z

.field public g:Lc/b/q/x1;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    sput-object v0, Lc/b/q/z1;->h:Landroid/graphics/PorterDuff$Mode;

    .line 2
    new-instance v0, Lc/b/q/v1;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Lc/b/q/v1;-><init>(I)V

    sput-object v0, Lc/b/q/z1;->j:Lc/b/q/v1;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/WeakHashMap;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/WeakHashMap;-><init>(I)V

    iput-object v0, p0, Lc/b/q/z1;->d:Ljava/util/WeakHashMap;

    return-void
.end method

.method public static a(Landroid/util/TypedValue;)J
    .locals 4

    .line 18
    iget v0, p0, Landroid/util/TypedValue;->assetCookie:I

    int-to-long v0, v0

    const/16 v2, 0x20

    shl-long/2addr v0, v2

    iget p0, p0, Landroid/util/TypedValue;->data:I

    int-to-long v2, p0

    or-long/2addr v0, v2

    return-wide v0
.end method

.method public static declared-synchronized a(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;
    .locals 3

    const-class v0, Lc/b/q/z1;

    monitor-enter v0

    .line 77
    :try_start_0
    sget-object v1, Lc/b/q/z1;->j:Lc/b/q/v1;

    invoke-virtual {v1, p0, p1}, Lc/b/q/v1;->a(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;

    move-result-object v1

    if-nez v1, :cond_0

    .line 78
    new-instance v1, Landroid/graphics/PorterDuffColorFilter;

    invoke-direct {v1, p0, p1}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    .line 79
    sget-object v2, Lc/b/q/z1;->j:Lc/b/q/v1;

    invoke-virtual {v2, p0, p1, v1}, Lc/b/q/v1;->a(ILandroid/graphics/PorterDuff$Mode;Landroid/graphics/PorterDuffColorFilter;)Landroid/graphics/PorterDuffColorFilter;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 80
    :cond_0
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static a(Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;[I)Landroid/graphics/PorterDuffColorFilter;
    .locals 1

    if-eqz p0, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 75
    invoke-virtual {p0, p2, v0}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result p0

    .line 76
    invoke-static {p0, p1}, Lc/b/q/z1;->a(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;

    move-result-object p0

    return-object p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static declared-synchronized a()Lc/b/q/z1;
    .locals 2

    const-class v0, Lc/b/q/z1;

    monitor-enter v0

    .line 1
    :try_start_0
    sget-object v1, Lc/b/q/z1;->i:Lc/b/q/z1;

    if-nez v1, :cond_0

    .line 2
    new-instance v1, Lc/b/q/z1;

    invoke-direct {v1}, Lc/b/q/z1;-><init>()V

    sput-object v1, Lc/b/q/z1;->i:Lc/b/q/z1;

    .line 3
    invoke-static {v1}, Lc/b/q/z1;->a(Lc/b/q/z1;)V

    .line 4
    :cond_0
    sget-object v1, Lc/b/q/z1;->i:Lc/b/q/z1;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public static a(Landroid/graphics/drawable/Drawable;Lc/b/q/i2;[I)V
    .locals 2

    .line 67
    invoke-static {p0}, Lc/b/q/a1;->a(Landroid/graphics/drawable/Drawable;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 68
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eq v0, p0, :cond_0

    const-string p0, "ResourceManagerInternal"

    const-string p1, "Mutated drawable is not the same instance as the input."

    .line 69
    invoke-static {p0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 70
    :cond_0
    iget-boolean v0, p1, Lc/b/q/i2;->d:Z

    if-nez v0, :cond_2

    iget-boolean v0, p1, Lc/b/q/i2;->c:Z

    if-eqz v0, :cond_1

    goto :goto_0

    .line 71
    :cond_1
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->clearColorFilter()V

    goto :goto_3

    .line 72
    :cond_2
    :goto_0
    iget-boolean v0, p1, Lc/b/q/i2;->d:Z

    if-eqz v0, :cond_3

    iget-object v0, p1, Lc/b/q/i2;->a:Landroid/content/res/ColorStateList;

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    :goto_1
    iget-boolean v1, p1, Lc/b/q/i2;->c:Z

    if-eqz v1, :cond_4

    iget-object p1, p1, Lc/b/q/i2;->b:Landroid/graphics/PorterDuff$Mode;

    goto :goto_2

    :cond_4
    sget-object p1, Lc/b/q/z1;->h:Landroid/graphics/PorterDuff$Mode;

    :goto_2
    invoke-static {v0, p1, p2}, Lc/b/q/z1;->a(Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;[I)Landroid/graphics/PorterDuffColorFilter;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 73
    :goto_3
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p2, 0x17

    if-gt p1, p2, :cond_5

    .line 74
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    :cond_5
    return-void
.end method

.method public static a(Lc/b/q/z1;)V
    .locals 2

    .line 5
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-ge v0, v1, :cond_0

    .line 6
    new-instance v0, Lc/b/q/y1;

    invoke-direct {v0}, Lc/b/q/y1;-><init>()V

    const-string v1, "vector"

    invoke-virtual {p0, v1, v0}, Lc/b/q/z1;->a(Ljava/lang/String;Lc/b/q/w1;)V

    .line 7
    new-instance v0, Lc/b/q/u1;

    invoke-direct {v0}, Lc/b/q/u1;-><init>()V

    const-string v1, "animated-vector"

    invoke-virtual {p0, v1, v0}, Lc/b/q/z1;->a(Ljava/lang/String;Lc/b/q/w1;)V

    .line 8
    new-instance v0, Lc/b/q/t1;

    invoke-direct {v0}, Lc/b/q/t1;-><init>()V

    const-string v1, "animated-selector"

    invoke-virtual {p0, v1, v0}, Lc/b/q/z1;->a(Ljava/lang/String;Lc/b/q/w1;)V

    :cond_0
    return-void
.end method

.method public static a(Landroid/graphics/drawable/Drawable;)Z
    .locals 1

    .line 87
    instance-of v0, p0, Lc/w/a/a/w;

    if-nez v0, :cond_1

    const-string v0, "android.graphics.drawable.VectorDrawable"

    .line 88
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method


# virtual methods
.method public a(I)Landroid/graphics/PorterDuff$Mode;
    .locals 1

    .line 60
    iget-object v0, p0, Lc/b/q/z1;->g:Lc/b/q/x1;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-interface {v0, p1}, Lc/b/q/x1;->a(I)Landroid/graphics/PorterDuff$Mode;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public final a(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    .locals 4

    .line 19
    iget-object v0, p0, Lc/b/q/z1;->e:Landroid/util/TypedValue;

    if-nez v0, :cond_0

    .line 20
    new-instance v0, Landroid/util/TypedValue;

    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    iput-object v0, p0, Lc/b/q/z1;->e:Landroid/util/TypedValue;

    .line 21
    :cond_0
    iget-object v0, p0, Lc/b/q/z1;->e:Landroid/util/TypedValue;

    .line 22
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, p2, v0, v2}, Landroid/content/res/Resources;->getValue(ILandroid/util/TypedValue;Z)V

    .line 23
    invoke-static {v0}, Lc/b/q/z1;->a(Landroid/util/TypedValue;)J

    move-result-wide v1

    .line 24
    invoke-virtual {p0, p1, v1, v2}, Lc/b/q/z1;->a(Landroid/content/Context;J)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-eqz v3, :cond_1

    return-object v3

    .line 25
    :cond_1
    iget-object v3, p0, Lc/b/q/z1;->g:Lc/b/q/x1;

    if-nez v3, :cond_2

    const/4 p2, 0x0

    goto :goto_0

    .line 26
    :cond_2
    invoke-interface {v3, p0, p1, p2}, Lc/b/q/x1;->a(Lc/b/q/z1;Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    :goto_0
    if-eqz p2, :cond_3

    .line 27
    iget v0, v0, Landroid/util/TypedValue;->changingConfigurations:I

    invoke-virtual {p2, v0}, Landroid/graphics/drawable/Drawable;->setChangingConfigurations(I)V

    .line 28
    invoke-virtual {p0, p1, v1, v2, p2}, Lc/b/q/z1;->a(Landroid/content/Context;JLandroid/graphics/drawable/Drawable;)Z

    :cond_3
    return-object p2
.end method

.method public declared-synchronized a(Landroid/content/Context;IZ)Landroid/graphics/drawable/Drawable;
    .locals 1

    monitor-enter p0

    .line 11
    :try_start_0
    invoke-virtual {p0, p1}, Lc/b/q/z1;->a(Landroid/content/Context;)V

    .line 12
    invoke-virtual {p0, p1, p2}, Lc/b/q/z1;->e(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-nez v0, :cond_0

    .line 13
    invoke-virtual {p0, p1, p2}, Lc/b/q/z1;->a(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    :cond_0
    if-nez v0, :cond_1

    .line 14
    invoke-static {p1, p2}, Lc/h/f/f;->c(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    :cond_1
    if-eqz v0, :cond_2

    .line 15
    invoke-virtual {p0, p1, p2, p3, v0}, Lc/b/q/z1;->a(Landroid/content/Context;IZLandroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    :cond_2
    if-eqz v0, :cond_3

    .line 16
    invoke-static {v0}, Lc/b/q/a1;->b(Landroid/graphics/drawable/Drawable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    :cond_3
    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final a(Landroid/content/Context;IZLandroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 29
    invoke-virtual {p0, p1, p2}, Lc/b/q/z1;->c(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 30
    invoke-static {p4}, Lc/b/q/a1;->a(Landroid/graphics/drawable/Drawable;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 31
    invoke-virtual {p4}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object p4

    .line 32
    :cond_0
    invoke-static {p4}, Lc/h/g/r/a;->h(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object p4

    .line 33
    invoke-static {p4, v0}, Lc/h/g/r/a;->a(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    .line 34
    invoke-virtual {p0, p2}, Lc/b/q/z1;->a(I)Landroid/graphics/PorterDuff$Mode;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 35
    invoke-static {p4, p1}, Lc/h/g/r/a;->a(Landroid/graphics/drawable/Drawable;Landroid/graphics/PorterDuff$Mode;)V

    goto :goto_0

    .line 36
    :cond_1
    iget-object v0, p0, Lc/b/q/z1;->g:Lc/b/q/x1;

    if-eqz v0, :cond_2

    invoke-interface {v0, p1, p2, p4}, Lc/b/q/x1;->b(Landroid/content/Context;ILandroid/graphics/drawable/Drawable;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    .line 37
    :cond_2
    invoke-virtual {p0, p1, p2, p4}, Lc/b/q/z1;->a(Landroid/content/Context;ILandroid/graphics/drawable/Drawable;)Z

    move-result p1

    if-nez p1, :cond_3

    if-eqz p3, :cond_3

    const/4 p4, 0x0

    :cond_3
    :goto_0
    return-object p4
.end method

.method public final declared-synchronized a(Landroid/content/Context;J)Landroid/graphics/drawable/Drawable;
    .locals 3

    monitor-enter p0

    .line 38
    :try_start_0
    iget-object v0, p0, Lc/b/q/z1;->d:Ljava/util/WeakHashMap;

    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/e/f;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 39
    monitor-exit p0

    return-object v1

    .line 40
    :cond_0
    :try_start_1
    invoke-virtual {v0, p2, p3}, Lc/e/f;->b(J)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/ref/WeakReference;

    if-eqz v2, :cond_2

    .line 41
    invoke-virtual {v2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/graphics/drawable/Drawable$ConstantState;

    if-eqz v2, :cond_1

    .line 42
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {v2, p1}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable(Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object p1

    .line 43
    :cond_1
    :try_start_2
    invoke-virtual {v0, p2, p3}, Lc/e/f;->a(J)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 44
    :cond_2
    monitor-exit p0

    return-object v1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized a(Landroid/content/Context;Lc/b/q/u2;I)Landroid/graphics/drawable/Drawable;
    .locals 1

    monitor-enter p0

    .line 52
    :try_start_0
    invoke-virtual {p0, p1, p3}, Lc/b/q/z1;->e(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-nez v0, :cond_0

    .line 53
    invoke-virtual {p2, p3}, Lc/b/q/u2;->a(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    :cond_0
    if-eqz v0, :cond_1

    const/4 p2, 0x0

    .line 54
    invoke-virtual {p0, p1, p3, p2, v0}, Lc/b/q/z1;->a(Landroid/content/Context;IZLandroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :cond_1
    const/4 p1, 0x0

    .line 55
    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final a(Landroid/content/Context;)V
    .locals 1

    .line 81
    iget-boolean v0, p0, Lc/b/q/z1;->f:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 82
    iput-boolean v0, p0, Lc/b/q/z1;->f:Z

    .line 83
    sget v0, Lc/b/n/a;->abc_vector_test:I

    invoke-virtual {p0, p1, v0}, Lc/b/q/z1;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 84
    invoke-static {p1}, Lc/b/q/z1;->a(Landroid/graphics/drawable/Drawable;)Z

    move-result p1

    if-eqz p1, :cond_1

    return-void

    :cond_1
    const/4 p1, 0x0

    .line 85
    iput-boolean p1, p0, Lc/b/q/z1;->f:Z

    .line 86
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final a(Landroid/content/Context;ILandroid/content/res/ColorStateList;)V
    .locals 2

    .line 61
    iget-object v0, p0, Lc/b/q/z1;->a:Ljava/util/WeakHashMap;

    if-nez v0, :cond_0

    .line 62
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    iput-object v0, p0, Lc/b/q/z1;->a:Ljava/util/WeakHashMap;

    .line 63
    :cond_0
    iget-object v0, p0, Lc/b/q/z1;->a:Ljava/util/WeakHashMap;

    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/e/j;

    if-nez v0, :cond_1

    .line 64
    new-instance v0, Lc/e/j;

    invoke-direct {v0}, Lc/e/j;-><init>()V

    .line 65
    iget-object v1, p0, Lc/b/q/z1;->a:Ljava/util/WeakHashMap;

    invoke-virtual {v1, p1, v0}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    :cond_1
    invoke-virtual {v0, p2, p3}, Lc/e/j;->a(ILjava/lang/Object;)V

    return-void
.end method

.method public declared-synchronized a(Lc/b/q/x1;)V
    .locals 0

    monitor-enter p0

    .line 9
    :try_start_0
    iput-object p1, p0, Lc/b/q/z1;->g:Lc/b/q/x1;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final a(Ljava/lang/String;Lc/b/q/w1;)V
    .locals 1

    .line 57
    iget-object v0, p0, Lc/b/q/z1;->b:Lc/e/b;

    if-nez v0, :cond_0

    .line 58
    new-instance v0, Lc/e/b;

    invoke-direct {v0}, Lc/e/b;-><init>()V

    iput-object v0, p0, Lc/b/q/z1;->b:Lc/e/b;

    .line 59
    :cond_0
    iget-object v0, p0, Lc/b/q/z1;->b:Lc/e/b;

    invoke-virtual {v0, p1, p2}, Lc/e/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public a(Landroid/content/Context;ILandroid/graphics/drawable/Drawable;)Z
    .locals 1

    .line 56
    iget-object v0, p0, Lc/b/q/z1;->g:Lc/b/q/x1;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2, p3}, Lc/b/q/x1;->a(Landroid/content/Context;ILandroid/graphics/drawable/Drawable;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final declared-synchronized a(Landroid/content/Context;JLandroid/graphics/drawable/Drawable;)Z
    .locals 2

    monitor-enter p0

    .line 45
    :try_start_0
    invoke-virtual {p4}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    move-result-object p4

    if-eqz p4, :cond_1

    .line 46
    iget-object v0, p0, Lc/b/q/z1;->d:Ljava/util/WeakHashMap;

    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/e/f;

    if-nez v0, :cond_0

    .line 47
    new-instance v0, Lc/e/f;

    invoke-direct {v0}, Lc/e/f;-><init>()V

    .line 48
    iget-object v1, p0, Lc/b/q/z1;->d:Ljava/util/WeakHashMap;

    invoke-virtual {v1, p1, v0}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    :cond_0
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p4}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, p2, p3, p1}, Lc/e/f;->c(JLjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p1, 0x1

    .line 50
    monitor-exit p0

    return p1

    :cond_1
    const/4 p1, 0x0

    .line 51
    monitor-exit p0

    return p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    .locals 1

    monitor-enter p0

    const/4 v0, 0x0

    .line 1
    :try_start_0
    invoke-virtual {p0, p1, p2, v0}, Lc/b/q/z1;->a(Landroid/content/Context;IZ)Landroid/graphics/drawable/Drawable;

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

.method public declared-synchronized b(Landroid/content/Context;)V
    .locals 1

    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lc/b/q/z1;->d:Ljava/util/WeakHashMap;

    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc/e/f;

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p1}, Lc/e/f;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized c(Landroid/content/Context;I)Landroid/content/res/ColorStateList;
    .locals 1

    monitor-enter p0

    .line 1
    :try_start_0
    invoke-virtual {p0, p1, p2}, Lc/b/q/z1;->d(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object v0

    if-nez v0, :cond_1

    .line 2
    iget-object v0, p0, Lc/b/q/z1;->g:Lc/b/q/x1;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lc/b/q/z1;->g:Lc/b/q/x1;

    invoke-interface {v0, p1, p2}, Lc/b/q/x1;->a(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_1

    .line 3
    invoke-virtual {p0, p1, p2, v0}, Lc/b/q/z1;->a(Landroid/content/Context;ILandroid/content/res/ColorStateList;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    :cond_1
    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final d(Landroid/content/Context;I)Landroid/content/res/ColorStateList;
    .locals 2

    .line 1
    iget-object v0, p0, Lc/b/q/z1;->a:Ljava/util/WeakHashMap;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc/e/j;

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p1, p2}, Lc/e/j;->a(I)Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Landroid/content/res/ColorStateList;

    :cond_0
    return-object v1
.end method

.method public final e(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    .locals 10

    .line 1
    iget-object v0, p0, Lc/b/q/z1;->b:Lc/e/b;

    const/4 v1, 0x0

    if-eqz v0, :cond_a

    invoke-virtual {v0}, Lc/e/i;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_a

    .line 2
    iget-object v0, p0, Lc/b/q/z1;->c:Lc/e/j;

    const-string v2, "appcompat_skip_skip"

    if-eqz v0, :cond_1

    .line 3
    invoke-virtual {v0, p2}, Lc/e/j;->a(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 4
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    if-eqz v0, :cond_2

    iget-object v3, p0, Lc/b/q/z1;->b:Lc/e/b;

    .line 5
    invoke-virtual {v3, v0}, Lc/e/i;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_2

    :cond_0
    return-object v1

    .line 6
    :cond_1
    new-instance v0, Lc/e/j;

    invoke-direct {v0}, Lc/e/j;-><init>()V

    iput-object v0, p0, Lc/b/q/z1;->c:Lc/e/j;

    .line 7
    :cond_2
    iget-object v0, p0, Lc/b/q/z1;->e:Landroid/util/TypedValue;

    if-nez v0, :cond_3

    .line 8
    new-instance v0, Landroid/util/TypedValue;

    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    iput-object v0, p0, Lc/b/q/z1;->e:Landroid/util/TypedValue;

    .line 9
    :cond_3
    iget-object v0, p0, Lc/b/q/z1;->e:Landroid/util/TypedValue;

    .line 10
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const/4 v3, 0x1

    .line 11
    invoke-virtual {v1, p2, v0, v3}, Landroid/content/res/Resources;->getValue(ILandroid/util/TypedValue;Z)V

    .line 12
    invoke-static {v0}, Lc/b/q/z1;->a(Landroid/util/TypedValue;)J

    move-result-wide v4

    .line 13
    invoke-virtual {p0, p1, v4, v5}, Lc/b/q/z1;->a(Landroid/content/Context;J)Landroid/graphics/drawable/Drawable;

    move-result-object v6

    if-eqz v6, :cond_4

    return-object v6

    .line 14
    :cond_4
    iget-object v7, v0, Landroid/util/TypedValue;->string:Ljava/lang/CharSequence;

    if-eqz v7, :cond_8

    invoke-interface {v7}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v7

    const-string v8, ".xml"

    invoke-virtual {v7, v8}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_8

    .line 15
    :try_start_0
    invoke-virtual {v1, p2}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    move-result-object v1

    .line 16
    invoke-static {v1}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object v7

    .line 17
    :goto_0
    invoke-interface {v1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v8

    const/4 v9, 0x2

    if-eq v8, v9, :cond_5

    if-eq v8, v3, :cond_5

    goto :goto_0

    :cond_5
    if-ne v8, v9, :cond_7

    .line 18
    invoke-interface {v1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v3

    .line 19
    iget-object v8, p0, Lc/b/q/z1;->c:Lc/e/j;

    invoke-virtual {v8, p2, v3}, Lc/e/j;->a(ILjava/lang/Object;)V

    .line 20
    iget-object v8, p0, Lc/b/q/z1;->b:Lc/e/b;

    invoke-virtual {v8, v3}, Lc/e/i;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lc/b/q/w1;

    if-eqz v3, :cond_6

    .line 21
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v8

    .line 22
    invoke-interface {v3, p1, v1, v7, v8}, Lc/b/q/w1;->a(Landroid/content/Context;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    move-object v6, v1

    :cond_6
    if-eqz v6, :cond_8

    .line 23
    iget v0, v0, Landroid/util/TypedValue;->changingConfigurations:I

    invoke-virtual {v6, v0}, Landroid/graphics/drawable/Drawable;->setChangingConfigurations(I)V

    .line 24
    invoke-virtual {p0, p1, v4, v5, v6}, Lc/b/q/z1;->a(Landroid/content/Context;JLandroid/graphics/drawable/Drawable;)Z

    goto :goto_1

    .line 25
    :cond_7
    new-instance p1, Lorg/xmlpull/v1/XmlPullParserException;

    const-string v0, "No start tag found"

    invoke-direct {p1, v0}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p1

    const-string v0, "ResourceManagerInternal"

    const-string v1, "Exception while inflating drawable"

    .line 26
    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_8
    :goto_1
    if-nez v6, :cond_9

    .line 27
    iget-object p1, p0, Lc/b/q/z1;->c:Lc/e/j;

    invoke-virtual {p1, p2, v2}, Lc/e/j;->a(ILjava/lang/Object;)V

    :cond_9
    return-object v6

    :cond_a
    return-object v1
.end method