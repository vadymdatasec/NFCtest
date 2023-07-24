.class public Le/c/a/e2;
.super Le/c/a/f2;
.source "SourceFile"


# instance fields
.field public d:Landroid/graphics/Path;

.field public final synthetic e:Le/c/a/l2;


# direct methods
.method public constructor <init>(Le/c/a/l2;Landroid/graphics/Path;FF)V
    .locals 0

    .line 1
    iput-object p1, p0, Le/c/a/e2;->e:Le/c/a/l2;

    .line 2
    invoke-direct {p0, p1, p3, p4}, Le/c/a/f2;-><init>(Le/c/a/l2;FF)V

    .line 3
    iput-object p2, p0, Le/c/a/e2;->d:Landroid/graphics/Path;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 7

    .line 1
    iget-object v0, p0, Le/c/a/e2;->e:Le/c/a/l2;

    invoke-static {v0}, Le/c/a/l2;->a(Le/c/a/l2;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2
    iget-object v0, p0, Le/c/a/e2;->e:Le/c/a/l2;

    invoke-static {v0}, Le/c/a/l2;->b(Le/c/a/l2;)Le/c/a/h2;

    move-result-object v0

    iget-boolean v0, v0, Le/c/a/h2;->c:Z

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Le/c/a/e2;->e:Le/c/a/l2;

    invoke-static {v0}, Le/c/a/l2;->c(Le/c/a/l2;)Landroid/graphics/Canvas;

    move-result-object v1

    iget-object v3, p0, Le/c/a/e2;->d:Landroid/graphics/Path;

    iget v4, p0, Le/c/a/f2;->a:F

    iget v5, p0, Le/c/a/f2;->b:F

    iget-object v0, p0, Le/c/a/e2;->e:Le/c/a/l2;

    invoke-static {v0}, Le/c/a/l2;->b(Le/c/a/l2;)Le/c/a/h2;

    move-result-object v0

    iget-object v6, v0, Le/c/a/h2;->e:Landroid/graphics/Paint;

    move-object v2, p1

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawTextOnPath(Ljava/lang/String;Landroid/graphics/Path;FFLandroid/graphics/Paint;)V

    .line 4
    :cond_0
    iget-object v0, p0, Le/c/a/e2;->e:Le/c/a/l2;

    invoke-static {v0}, Le/c/a/l2;->b(Le/c/a/l2;)Le/c/a/h2;

    move-result-object v0

    iget-boolean v0, v0, Le/c/a/h2;->d:Z

    if-eqz v0, :cond_1

    .line 5
    iget-object v0, p0, Le/c/a/e2;->e:Le/c/a/l2;

    invoke-static {v0}, Le/c/a/l2;->c(Le/c/a/l2;)Landroid/graphics/Canvas;

    move-result-object v1

    iget-object v3, p0, Le/c/a/e2;->d:Landroid/graphics/Path;

    iget v4, p0, Le/c/a/f2;->a:F

    iget v5, p0, Le/c/a/f2;->b:F

    iget-object v0, p0, Le/c/a/e2;->e:Le/c/a/l2;

    invoke-static {v0}, Le/c/a/l2;->b(Le/c/a/l2;)Le/c/a/h2;

    move-result-object v0

    iget-object v6, v0, Le/c/a/h2;->f:Landroid/graphics/Paint;

    move-object v2, p1

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawTextOnPath(Ljava/lang/String;Landroid/graphics/Path;FFLandroid/graphics/Paint;)V

    .line 6
    :cond_1
    iget v0, p0, Le/c/a/f2;->a:F

    iget-object v1, p0, Le/c/a/e2;->e:Le/c/a/l2;

    invoke-static {v1}, Le/c/a/l2;->b(Le/c/a/l2;)Le/c/a/h2;

    move-result-object v1

    iget-object v1, v1, Le/c/a/h2;->e:Landroid/graphics/Paint;

    invoke-virtual {v1, p1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result p1

    add-float/2addr v0, p1

    iput v0, p0, Le/c/a/f2;->a:F

    return-void
.end method
