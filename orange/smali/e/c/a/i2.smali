.class public Le/c/a/i2;
.super Le/c/a/j2;
.source "SourceFile"


# instance fields
.field public a:F

.field public b:F

.field public c:Landroid/graphics/RectF;

.field public final synthetic d:Le/c/a/l2;


# direct methods
.method public constructor <init>(Le/c/a/l2;FF)V
    .locals 1

    .line 1
    iput-object p1, p0, Le/c/a/i2;->d:Le/c/a/l2;

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, v0}, Le/c/a/j2;-><init>(Le/c/a/l2;Le/c/a/j2;)V

    .line 3
    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, Le/c/a/i2;->c:Landroid/graphics/RectF;

    .line 4
    iput p2, p0, Le/c/a/i2;->a:F

    .line 5
    iput p3, p0, Le/c/a/i2;->b:F

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 4

    .line 12
    iget-object v0, p0, Le/c/a/i2;->d:Le/c/a/l2;

    invoke-static {v0}, Le/c/a/l2;->a(Le/c/a/l2;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 13
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 14
    iget-object v1, p0, Le/c/a/i2;->d:Le/c/a/l2;

    invoke-static {v1}, Le/c/a/l2;->b(Le/c/a/l2;)Le/c/a/h2;

    move-result-object v1

    iget-object v1, v1, Le/c/a/h2;->e:Landroid/graphics/Paint;

    const/4 v2, 0x0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    invoke-virtual {v1, p1, v2, v3, v0}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 15
    new-instance v1, Landroid/graphics/RectF;

    invoke-direct {v1, v0}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V

    .line 16
    iget v0, p0, Le/c/a/i2;->a:F

    iget v2, p0, Le/c/a/i2;->b:F

    invoke-virtual {v1, v0, v2}, Landroid/graphics/RectF;->offset(FF)V

    .line 17
    iget-object v0, p0, Le/c/a/i2;->c:Landroid/graphics/RectF;

    invoke-virtual {v0, v1}, Landroid/graphics/RectF;->union(Landroid/graphics/RectF;)V

    .line 18
    :cond_0
    iget v0, p0, Le/c/a/i2;->a:F

    iget-object v1, p0, Le/c/a/i2;->d:Le/c/a/l2;

    invoke-static {v1}, Le/c/a/l2;->b(Le/c/a/l2;)Le/c/a/h2;

    move-result-object v1

    iget-object v1, v1, Le/c/a/h2;->e:Landroid/graphics/Paint;

    invoke-virtual {v1, p1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result p1

    add-float/2addr v0, p1

    iput v0, p0, Le/c/a/i2;->a:F

    return-void
.end method

.method public a(Le/c/a/s1;)Z
    .locals 5

    .line 1
    instance-of v0, p1, Le/c/a/t1;

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    .line 2
    move-object v0, p1

    check-cast v0, Le/c/a/t1;

    .line 3
    iget-object p1, p1, Le/c/a/h1;->a:Le/c/a/a2;

    iget-object v2, v0, Le/c/a/t1;->n:Ljava/lang/String;

    invoke-virtual {p1, v2}, Le/c/a/a2;->b(Ljava/lang/String;)Le/c/a/h1;

    move-result-object p1

    const/4 v2, 0x0

    if-nez p1, :cond_0

    new-array p1, v1, [Ljava/lang/Object;

    .line 4
    iget-object v0, v0, Le/c/a/t1;->n:Ljava/lang/String;

    aput-object v0, p1, v2

    const-string v0, "TextPath path reference \'%s\' not found"

    invoke-static {v0, p1}, Le/c/a/l2;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    return v2

    .line 5
    :cond_0
    check-cast p1, Le/c/a/h0;

    .line 6
    new-instance v0, Le/c/a/d2;

    iget-object v3, p0, Le/c/a/i2;->d:Le/c/a/l2;

    iget-object v4, p1, Le/c/a/h0;->o:Le/c/a/i0;

    invoke-direct {v0, v3, v4}, Le/c/a/d2;-><init>(Le/c/a/l2;Le/c/a/i0;)V

    invoke-virtual {v0}, Le/c/a/d2;->a()Landroid/graphics/Path;

    move-result-object v0

    .line 7
    iget-object p1, p1, Le/c/a/x;->n:Landroid/graphics/Matrix;

    if-eqz p1, :cond_1

    .line 8
    invoke-virtual {v0, p1}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    .line 9
    :cond_1
    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    .line 10
    invoke-virtual {v0, p1, v1}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 11
    iget-object v0, p0, Le/c/a/i2;->c:Landroid/graphics/RectF;

    invoke-virtual {v0, p1}, Landroid/graphics/RectF;->union(Landroid/graphics/RectF;)V

    return v2

    :cond_2
    return v1
.end method
