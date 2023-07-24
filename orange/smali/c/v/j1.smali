.class public abstract Lc/v/j1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lc/v/n1;

.field public static b:Ljava/lang/reflect/Field;

.field public static c:Z

.field public static final d:Landroid/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Property<",
            "Landroid/view/View;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x16

    if-lt v0, v1, :cond_0

    .line 2
    new-instance v0, Lc/v/m1;

    invoke-direct {v0}, Lc/v/m1;-><init>()V

    sput-object v0, Lc/v/j1;->a:Lc/v/n1;

    goto :goto_0

    :cond_0
    const/16 v1, 0x15

    if-lt v0, v1, :cond_1

    .line 3
    new-instance v0, Lc/v/l1;

    invoke-direct {v0}, Lc/v/l1;-><init>()V

    sput-object v0, Lc/v/j1;->a:Lc/v/n1;

    goto :goto_0

    :cond_1
    const/16 v1, 0x13

    if-lt v0, v1, :cond_2

    .line 4
    new-instance v0, Lc/v/k1;

    invoke-direct {v0}, Lc/v/k1;-><init>()V

    sput-object v0, Lc/v/j1;->a:Lc/v/n1;

    goto :goto_0

    .line 5
    :cond_2
    new-instance v0, Lc/v/n1;

    invoke-direct {v0}, Lc/v/n1;-><init>()V

    sput-object v0, Lc/v/j1;->a:Lc/v/n1;

    .line 6
    :goto_0
    new-instance v0, Lc/v/h1;

    const-class v1, Ljava/lang/Float;

    const-string v2, "translationAlpha"

    invoke-direct {v0, v1, v2}, Lc/v/h1;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    sput-object v0, Lc/v/j1;->d:Landroid/util/Property;

    .line 7
    new-instance v0, Lc/v/i1;

    const-class v1, Landroid/graphics/Rect;

    const-string v2, "clipBounds"

    invoke-direct {v0, v1, v2}, Lc/v/i1;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    return-void
.end method

.method public static a()V
    .locals 3

    .line 9
    sget-boolean v0, Lc/v/j1;->c:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 10
    :try_start_0
    const-class v1, Landroid/view/View;

    const-string v2, "mViewFlags"

    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    sput-object v1, Lc/v/j1;->b:Ljava/lang/reflect/Field;

    .line 11
    invoke-virtual {v1, v0}, Ljava/lang/reflect/Field;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string v1, "ViewUtils"

    const-string v2, "fetchViewFlagsField: "

    .line 12
    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 13
    :goto_0
    sput-boolean v0, Lc/v/j1;->c:Z

    :cond_0
    return-void
.end method

.method public static a(Landroid/view/View;)V
    .locals 1

    .line 2
    sget-object v0, Lc/v/j1;->a:Lc/v/n1;

    invoke-virtual {v0, p0}, Lc/v/n1;->a(Landroid/view/View;)V

    return-void
.end method

.method public static a(Landroid/view/View;F)V
    .locals 1

    .line 1
    sget-object v0, Lc/v/j1;->a:Lc/v/n1;

    invoke-virtual {v0, p0, p1}, Lc/v/n1;->a(Landroid/view/View;F)V

    return-void
.end method

.method public static a(Landroid/view/View;I)V
    .locals 2

    .line 3
    invoke-static {}, Lc/v/j1;->a()V

    .line 4
    sget-object v0, Lc/v/j1;->b:Ljava/lang/reflect/Field;

    if-eqz v0, :cond_0

    .line 5
    :try_start_0
    invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    move-result v0

    .line 6
    sget-object v1, Lc/v/j1;->b:Ljava/lang/reflect/Field;

    and-int/lit8 v0, v0, -0xd

    or-int/2addr p1, v0

    invoke-virtual {v1, p0, p1}, Ljava/lang/reflect/Field;->setInt(Ljava/lang/Object;I)V
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method public static a(Landroid/view/View;IIII)V
    .locals 6

    .line 8
    sget-object v0, Lc/v/j1;->a:Lc/v/n1;

    move-object v1, p0

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    invoke-virtual/range {v0 .. v5}, Lc/v/n1;->a(Landroid/view/View;IIII)V

    return-void
.end method

.method public static a(Landroid/view/View;Landroid/graphics/Matrix;)V
    .locals 1

    .line 7
    sget-object v0, Lc/v/j1;->a:Lc/v/n1;

    invoke-virtual {v0, p0, p1}, Lc/v/n1;->a(Landroid/view/View;Landroid/graphics/Matrix;)V

    return-void
.end method

.method public static b(Landroid/view/View;)Lc/v/g1;
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x12

    if-lt v0, v1, :cond_0

    .line 2
    new-instance v0, Lc/v/f1;

    invoke-direct {v0, p0}, Lc/v/f1;-><init>(Landroid/view/View;)V

    return-object v0

    .line 3
    :cond_0
    invoke-static {p0}, Lc/v/e1;->c(Landroid/view/View;)Lc/v/e1;

    move-result-object p0

    return-object p0
.end method

.method public static b(Landroid/view/View;Landroid/graphics/Matrix;)V
    .locals 1

    .line 4
    sget-object v0, Lc/v/j1;->a:Lc/v/n1;

    invoke-virtual {v0, p0, p1}, Lc/v/n1;->b(Landroid/view/View;Landroid/graphics/Matrix;)V

    return-void
.end method

.method public static c(Landroid/view/View;)F
    .locals 1

    .line 1
    sget-object v0, Lc/v/j1;->a:Lc/v/n1;

    invoke-virtual {v0, p0}, Lc/v/n1;->b(Landroid/view/View;)F

    move-result p0

    return p0
.end method

.method public static d(Landroid/view/View;)Lc/v/u1;
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x12

    if-lt v0, v1, :cond_0

    .line 2
    new-instance v0, Lc/v/t1;

    invoke-direct {v0, p0}, Lc/v/t1;-><init>(Landroid/view/View;)V

    return-object v0

    .line 3
    :cond_0
    new-instance v0, Lc/v/s1;

    invoke-virtual {p0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object p0

    invoke-direct {v0, p0}, Lc/v/s1;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method

.method public static e(Landroid/view/View;)V
    .locals 1

    .line 1
    sget-object v0, Lc/v/j1;->a:Lc/v/n1;

    invoke-virtual {v0, p0}, Lc/v/n1;->c(Landroid/view/View;)V

    return-void
.end method
