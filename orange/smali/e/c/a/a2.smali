.class public Le/c/a/a2;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Le/c/a/h1;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public a:Le/c/a/z0;

.field public b:Le/c/a/m2;

.field public c:F

.field public d:Le/c/a/g;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    sput-object v0, Le/c/a/a2;->e:Ljava/util/List;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Le/c/a/a2;->a:Le/c/a/z0;

    .line 3
    iput-object v0, p0, Le/c/a/a2;->b:Le/c/a/m2;

    const/high16 v0, 0x42c00000    # 96.0f

    .line 4
    iput v0, p0, Le/c/a/a2;->c:F

    .line 5
    new-instance v0, Le/c/a/g;

    invoke-direct {v0}, Le/c/a/g;-><init>()V

    iput-object v0, p0, Le/c/a/a2;->d:Le/c/a/g;

    return-void
.end method

.method public static a(Ljava/io/InputStream;)Le/c/a/a2;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/caverock/androidsvg/SVGParseException;
        }
    .end annotation

    .line 1
    new-instance v0, Le/c/a/p2;

    invoke-direct {v0}, Le/c/a/p2;-><init>()V

    .line 2
    invoke-virtual {v0, p0}, Le/c/a/p2;->a(Ljava/io/InputStream;)Le/c/a/a2;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h()Ljava/util/List;
    .locals 1

    .line 1
    sget-object v0, Le/c/a/a2;->e:Ljava/util/List;

    return-object v0
.end method


# virtual methods
.method public a(II)Landroid/graphics/Picture;
    .locals 4

    .line 3
    new-instance v0, Landroid/graphics/Picture;

    invoke-direct {v0}, Landroid/graphics/Picture;-><init>()V

    .line 4
    invoke-virtual {v0, p1, p2}, Landroid/graphics/Picture;->beginRecording(II)Landroid/graphics/Canvas;

    move-result-object v1

    .line 5
    new-instance v2, Le/c/a/n;

    int-to-float p1, p1

    int-to-float p2, p2

    const/4 v3, 0x0

    invoke-direct {v2, v3, v3, p1, p2}, Le/c/a/n;-><init>(FFFF)V

    .line 6
    new-instance p1, Le/c/a/l2;

    iget p2, p0, Le/c/a/a2;->c:F

    invoke-direct {p1, v1, v2, p2}, Le/c/a/l2;-><init>(Landroid/graphics/Canvas;Le/c/a/n;F)V

    const/4 p2, 0x0

    const/4 v1, 0x0

    .line 7
    invoke-virtual {p1, p0, p2, p2, v1}, Le/c/a/l2;->a(Le/c/a/a2;Le/c/a/n;Le/c/a/m;Z)V

    .line 8
    invoke-virtual {v0}, Landroid/graphics/Picture;->endRecording()V

    return-object v0
.end method

.method public final a(Le/c/a/d1;Ljava/lang/String;)Le/c/a/f1;
    .locals 3

    .line 26
    move-object v0, p1

    check-cast v0, Le/c/a/f1;

    .line 27
    iget-object v1, v0, Le/c/a/f1;->c:Ljava/lang/String;

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    .line 28
    :cond_0
    invoke-interface {p1}, Le/c/a/d1;->e()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_2

    const/4 p1, 0x0

    return-object p1

    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/c/a/h1;

    .line 29
    instance-of v1, v0, Le/c/a/f1;

    if-nez v1, :cond_3

    goto :goto_0

    .line 30
    :cond_3
    move-object v1, v0

    check-cast v1, Le/c/a/f1;

    .line 31
    iget-object v2, v1, Le/c/a/f1;->c:Ljava/lang/String;

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    return-object v1

    .line 32
    :cond_4
    instance-of v1, v0, Le/c/a/d1;

    if-eqz v1, :cond_1

    .line 33
    check-cast v0, Le/c/a/d1;

    invoke-virtual {p0, v0, p2}, Le/c/a/a2;->a(Le/c/a/d1;Ljava/lang/String;)Le/c/a/f1;

    move-result-object v0

    if-eqz v0, :cond_1

    return-object v0
.end method

.method public a(Ljava/lang/String;)Le/c/a/h1;
    .locals 1

    .line 23
    iget-object v0, p0, Le/c/a/a2;->a:Le/c/a/z0;

    iget-object v0, v0, Le/c/a/f1;->c:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 24
    iget-object p1, p0, Le/c/a/a2;->a:Le/c/a/z0;

    return-object p1

    .line 25
    :cond_0
    iget-object v0, p0, Le/c/a/a2;->a:Le/c/a/z0;

    invoke-virtual {p0, v0, p1}, Le/c/a/a2;->a(Le/c/a/d1;Ljava/lang/String;)Le/c/a/f1;

    move-result-object p1

    return-object p1
.end method

.method public final a(F)Le/c/a/n;
    .locals 5

    .line 10
    iget-object v0, p0, Le/c/a/a2;->a:Le/c/a/z0;

    iget-object v1, v0, Le/c/a/z0;->r:Le/c/a/b0;

    .line 11
    iget-object v0, v0, Le/c/a/z0;->s:Le/c/a/b0;

    const/high16 v2, -0x40800000    # -1.0f

    if-eqz v1, :cond_5

    .line 12
    invoke-virtual {v1}, Le/c/a/b0;->d()Z

    move-result v3

    if-nez v3, :cond_5

    iget-object v3, v1, Le/c/a/b0;->c:Le/c/a/x1;

    sget-object v4, Le/c/a/x1;->j:Le/c/a/x1;

    if-eq v3, v4, :cond_5

    sget-object v4, Le/c/a/x1;->c:Le/c/a/x1;

    if-eq v3, v4, :cond_5

    sget-object v4, Le/c/a/x1;->d:Le/c/a/x1;

    if-ne v3, v4, :cond_0

    goto :goto_2

    .line 13
    :cond_0
    invoke-virtual {v1, p1}, Le/c/a/b0;->a(F)F

    move-result v1

    if-eqz v0, :cond_3

    .line 14
    invoke-virtual {v0}, Le/c/a/b0;->d()Z

    move-result v3

    if-nez v3, :cond_2

    iget-object v3, v0, Le/c/a/b0;->c:Le/c/a/x1;

    sget-object v4, Le/c/a/x1;->j:Le/c/a/x1;

    if-eq v3, v4, :cond_2

    sget-object v4, Le/c/a/x1;->c:Le/c/a/x1;

    if-eq v3, v4, :cond_2

    sget-object v4, Le/c/a/x1;->d:Le/c/a/x1;

    if-ne v3, v4, :cond_1

    goto :goto_0

    .line 15
    :cond_1
    invoke-virtual {v0, p1}, Le/c/a/b0;->a(F)F

    move-result p1

    goto :goto_1

    .line 16
    :cond_2
    :goto_0
    new-instance p1, Le/c/a/n;

    invoke-direct {p1, v2, v2, v2, v2}, Le/c/a/n;-><init>(FFFF)V

    return-object p1

    .line 17
    :cond_3
    iget-object p1, p0, Le/c/a/a2;->a:Le/c/a/z0;

    iget-object p1, p1, Le/c/a/l1;->o:Le/c/a/n;

    if-eqz p1, :cond_4

    .line 18
    iget v0, p1, Le/c/a/n;->e:F

    mul-float v0, v0, v1

    iget p1, p1, Le/c/a/n;->d:F

    div-float p1, v0, p1

    goto :goto_1

    :cond_4
    move p1, v1

    .line 19
    :goto_1
    new-instance v0, Le/c/a/n;

    const/4 v2, 0x0

    invoke-direct {v0, v2, v2, v1, p1}, Le/c/a/n;-><init>(FFFF)V

    return-object v0

    .line 20
    :cond_5
    :goto_2
    new-instance p1, Le/c/a/n;

    invoke-direct {p1, v2, v2, v2, v2}, Le/c/a/n;-><init>(FFFF)V

    return-object p1
.end method

.method public a()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Le/c/a/f;",
            ">;"
        }
    .end annotation

    .line 22
    iget-object v0, p0, Le/c/a/a2;->d:Le/c/a/g;

    invoke-virtual {v0}, Le/c/a/g;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public a(Le/c/a/g;)V
    .locals 1

    .line 21
    iget-object v0, p0, Le/c/a/a2;->d:Le/c/a/g;

    invoke-virtual {v0, p1}, Le/c/a/g;->a(Le/c/a/g;)V

    return-void
.end method

.method public a(Le/c/a/z0;)V
    .locals 0

    .line 9
    iput-object p1, p0, Le/c/a/a2;->a:Le/c/a/z0;

    return-void
.end method

.method public b()F
    .locals 2

    .line 1
    iget-object v0, p0, Le/c/a/a2;->a:Le/c/a/z0;

    if-eqz v0, :cond_0

    .line 2
    iget v0, p0, Le/c/a/a2;->c:F

    invoke-virtual {p0, v0}, Le/c/a/a2;->a(F)Le/c/a/n;

    move-result-object v0

    iget v0, v0, Le/c/a/n;->e:F

    return v0

    .line 3
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "SVG document is empty"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public b(Ljava/lang/String;)Le/c/a/h1;
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 7
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x1

    if-le v1, v2, :cond_1

    const-string v1, "#"

    invoke-virtual {p1, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 8
    invoke-virtual {p1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Le/c/a/a2;->a(Ljava/lang/String;)Le/c/a/h1;

    move-result-object p1

    return-object p1

    :cond_1
    return-object v0
.end method

.method public b(F)V
    .locals 2

    .line 4
    iget-object v0, p0, Le/c/a/a2;->a:Le/c/a/z0;

    if-eqz v0, :cond_0

    .line 5
    new-instance v1, Le/c/a/b0;

    invoke-direct {v1, p1}, Le/c/a/b0;-><init>(F)V

    iput-object v1, v0, Le/c/a/z0;->s:Le/c/a/b0;

    return-void

    .line 6
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "SVG document is empty"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public c()Landroid/graphics/RectF;
    .locals 2

    .line 4
    iget-object v0, p0, Le/c/a/a2;->a:Le/c/a/z0;

    if-eqz v0, :cond_1

    .line 5
    iget-object v0, v0, Le/c/a/l1;->o:Le/c/a/n;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 6
    :cond_0
    invoke-virtual {v0}, Le/c/a/n;->d()Landroid/graphics/RectF;

    move-result-object v0

    return-object v0

    .line 7
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "SVG document is empty"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public c(F)V
    .locals 2

    .line 1
    iget-object v0, p0, Le/c/a/a2;->a:Le/c/a/z0;

    if-eqz v0, :cond_0

    .line 2
    new-instance v1, Le/c/a/b0;

    invoke-direct {v1, p1}, Le/c/a/b0;-><init>(F)V

    iput-object v1, v0, Le/c/a/z0;->r:Le/c/a/b0;

    return-void

    .line 3
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "SVG document is empty"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public c(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public d()F
    .locals 2

    .line 1
    iget-object v0, p0, Le/c/a/a2;->a:Le/c/a/z0;

    if-eqz v0, :cond_0

    .line 2
    iget v0, p0, Le/c/a/a2;->c:F

    invoke-virtual {p0, v0}, Le/c/a/a2;->a(F)Le/c/a/n;

    move-result-object v0

    iget v0, v0, Le/c/a/n;->d:F

    return v0

    .line 3
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "SVG document is empty"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public d(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public e()Le/c/a/m2;
    .locals 1

    .line 1
    iget-object v0, p0, Le/c/a/a2;->b:Le/c/a/m2;

    return-object v0
.end method

.method public f()Le/c/a/z0;
    .locals 1

    .line 1
    iget-object v0, p0, Le/c/a/a2;->a:Le/c/a/z0;

    return-object v0
.end method

.method public g()Z
    .locals 1

    .line 1
    iget-object v0, p0, Le/c/a/a2;->d:Le/c/a/g;

    invoke-virtual {v0}, Le/c/a/g;->b()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method
