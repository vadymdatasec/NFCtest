.class public abstract Lc/b/q/g2;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Landroid/util/TypedValue;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:[I

.field public static final c:[I

.field public static final d:[I

.field public static final e:[I

.field public static final f:[I

.field public static final g:[I


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    sput-object v0, Lc/b/q/g2;->a:Ljava/lang/ThreadLocal;

    const/4 v0, 0x1

    new-array v1, v0, [I

    const v2, -0x101009e

    const/4 v3, 0x0

    aput v2, v1, v3

    .line 2
    sput-object v1, Lc/b/q/g2;->b:[I

    new-array v1, v0, [I

    const v2, 0x101009c

    aput v2, v1, v3

    .line 3
    sput-object v1, Lc/b/q/g2;->c:[I

    new-array v1, v0, [I

    const v2, 0x10100a7

    aput v2, v1, v3

    .line 4
    sput-object v1, Lc/b/q/g2;->d:[I

    new-array v1, v0, [I

    const v2, 0x10100a0

    aput v2, v1, v3

    .line 5
    sput-object v1, Lc/b/q/g2;->e:[I

    new-array v1, v3, [I

    .line 6
    sput-object v1, Lc/b/q/g2;->f:[I

    new-array v0, v0, [I

    .line 7
    sput-object v0, Lc/b/q/g2;->g:[I

    return-void
.end method

.method public static a(Landroid/content/Context;I)I
    .locals 4

    .line 1
    invoke-static {p0, p1}, Lc/b/q/g2;->c(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/content/res/ColorStateList;->isStateful()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 3
    sget-object p0, Lc/b/q/g2;->b:[I

    invoke-virtual {v0}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result p1

    invoke-virtual {v0, p0, p1}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result p0

    return p0

    .line 4
    :cond_0
    invoke-static {}, Lc/b/q/g2;->a()Landroid/util/TypedValue;

    move-result-object v0

    .line 5
    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v1

    const v2, 0x1010033

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v0, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 6
    invoke-virtual {v0}, Landroid/util/TypedValue;->getFloat()F

    move-result v0

    .line 7
    invoke-static {p0, p1, v0}, Lc/b/q/g2;->a(Landroid/content/Context;IF)I

    move-result p0

    return p0
.end method

.method public static a(Landroid/content/Context;IF)I
    .locals 0

    .line 11
    invoke-static {p0, p1}, Lc/b/q/g2;->b(Landroid/content/Context;I)I

    move-result p0

    .line 12
    invoke-static {p0}, Landroid/graphics/Color;->alpha(I)I

    move-result p1

    int-to-float p1, p1

    mul-float p1, p1, p2

    .line 13
    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    invoke-static {p0, p1}, Lc/h/g/a;->c(II)I

    move-result p0

    return p0
.end method

.method public static a()Landroid/util/TypedValue;
    .locals 2

    .line 8
    sget-object v0, Lc/b/q/g2;->a:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/util/TypedValue;

    if-nez v0, :cond_0

    .line 9
    new-instance v0, Landroid/util/TypedValue;

    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    .line 10
    sget-object v1, Lc/b/q/g2;->a:Ljava/lang/ThreadLocal;

    invoke-virtual {v1, v0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    :cond_0
    return-object v0
.end method

.method public static b(Landroid/content/Context;I)I
    .locals 2

    .line 1
    sget-object v0, Lc/b/q/g2;->g:[I

    const/4 v1, 0x0

    aput p1, v0, v1

    const/4 p1, 0x0

    .line 2
    invoke-static {p0, p1, v0}, Lc/b/q/k2;->a(Landroid/content/Context;Landroid/util/AttributeSet;[I)Lc/b/q/k2;

    move-result-object p0

    .line 3
    :try_start_0
    invoke-virtual {p0, v1, v1}, Lc/b/q/k2;->a(II)I

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    invoke-virtual {p0}, Lc/b/q/k2;->a()V

    return p1

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, Lc/b/q/k2;->a()V

    .line 5
    throw p1
.end method

.method public static c(Landroid/content/Context;I)Landroid/content/res/ColorStateList;
    .locals 2

    .line 1
    sget-object v0, Lc/b/q/g2;->g:[I

    const/4 v1, 0x0

    aput p1, v0, v1

    const/4 p1, 0x0

    .line 2
    invoke-static {p0, p1, v0}, Lc/b/q/k2;->a(Landroid/content/Context;Landroid/util/AttributeSet;[I)Lc/b/q/k2;

    move-result-object p0

    .line 3
    :try_start_0
    invoke-virtual {p0, v1}, Lc/b/q/k2;->a(I)Landroid/content/res/ColorStateList;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    invoke-virtual {p0}, Lc/b/q/k2;->a()V

    return-object p1

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, Lc/b/q/k2;->a()V

    .line 5
    throw p1
.end method
