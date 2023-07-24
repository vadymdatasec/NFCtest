.class public Le/c/a/f2;
.super Le/c/a/j2;
.source "SourceFile"


# instance fields
.field public a:F

.field public b:F

.field public final synthetic c:Le/c/a/l2;


# direct methods
.method public constructor <init>(Le/c/a/l2;FF)V
    .locals 1

    .line 1
    iput-object p1, p0, Le/c/a/f2;->c:Le/c/a/l2;

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, v0}, Le/c/a/j2;-><init>(Le/c/a/l2;Le/c/a/j2;)V

    .line 3
    iput p2, p0, Le/c/a/f2;->a:F

    .line 4
    iput p3, p0, Le/c/a/f2;->b:F

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 4

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "TextSequence render"

    .line 1
    invoke-static {v1, v0}, Le/c/a/l2;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2
    iget-object v0, p0, Le/c/a/f2;->c:Le/c/a/l2;

    invoke-static {v0}, Le/c/a/l2;->a(Le/c/a/l2;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3
    iget-object v0, p0, Le/c/a/f2;->c:Le/c/a/l2;

    invoke-static {v0}, Le/c/a/l2;->b(Le/c/a/l2;)Le/c/a/h2;

    move-result-object v0

    iget-boolean v0, v0, Le/c/a/h2;->c:Z

    if-eqz v0, :cond_0

    .line 4
    iget-object v0, p0, Le/c/a/f2;->c:Le/c/a/l2;

    invoke-static {v0}, Le/c/a/l2;->c(Le/c/a/l2;)Landroid/graphics/Canvas;

    move-result-object v0

    iget v1, p0, Le/c/a/f2;->a:F

    iget v2, p0, Le/c/a/f2;->b:F

    iget-object v3, p0, Le/c/a/f2;->c:Le/c/a/l2;

    invoke-static {v3}, Le/c/a/l2;->b(Le/c/a/l2;)Le/c/a/h2;

    move-result-object v3

    iget-object v3, v3, Le/c/a/h2;->e:Landroid/graphics/Paint;

    invoke-virtual {v0, p1, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 5
    :cond_0
    iget-object v0, p0, Le/c/a/f2;->c:Le/c/a/l2;

    invoke-static {v0}, Le/c/a/l2;->b(Le/c/a/l2;)Le/c/a/h2;

    move-result-object v0

    iget-boolean v0, v0, Le/c/a/h2;->d:Z

    if-eqz v0, :cond_1

    .line 6
    iget-object v0, p0, Le/c/a/f2;->c:Le/c/a/l2;

    invoke-static {v0}, Le/c/a/l2;->c(Le/c/a/l2;)Landroid/graphics/Canvas;

    move-result-object v0

    iget v1, p0, Le/c/a/f2;->a:F

    iget v2, p0, Le/c/a/f2;->b:F

    iget-object v3, p0, Le/c/a/f2;->c:Le/c/a/l2;

    invoke-static {v3}, Le/c/a/l2;->b(Le/c/a/l2;)Le/c/a/h2;

    move-result-object v3

    iget-object v3, v3, Le/c/a/h2;->f:Landroid/graphics/Paint;

    invoke-virtual {v0, p1, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 7
    :cond_1
    iget v0, p0, Le/c/a/f2;->a:F

    iget-object v1, p0, Le/c/a/f2;->c:Le/c/a/l2;

    invoke-static {v1}, Le/c/a/l2;->b(Le/c/a/l2;)Le/c/a/h2;

    move-result-object v1

    iget-object v1, v1, Le/c/a/h2;->e:Landroid/graphics/Paint;

    invoke-virtual {v1, p1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result p1

    add-float/2addr v0, p1

    iput v0, p0, Le/c/a/f2;->a:F

    return-void
.end method
