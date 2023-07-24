.class public Le/c/a/d2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/c/a/j0;


# instance fields
.field public a:Landroid/graphics/Path;

.field public b:F

.field public c:F


# direct methods
.method public constructor <init>(Le/c/a/l2;Le/c/a/i0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance p1, Landroid/graphics/Path;

    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    iput-object p1, p0, Le/c/a/d2;->a:Landroid/graphics/Path;

    .line 3
    invoke-virtual {p2, p0}, Le/c/a/i0;->a(Le/c/a/j0;)V

    return-void
.end method


# virtual methods
.method public a()Landroid/graphics/Path;
    .locals 1

    .line 1
    iget-object v0, p0, Le/c/a/d2;->a:Landroid/graphics/Path;

    return-object v0
.end method

.method public a(FF)V
    .locals 1

    .line 2
    iget-object v0, p0, Le/c/a/d2;->a:Landroid/graphics/Path;

    invoke-virtual {v0, p1, p2}, Landroid/graphics/Path;->moveTo(FF)V

    .line 3
    iput p1, p0, Le/c/a/d2;->b:F

    .line 4
    iput p2, p0, Le/c/a/d2;->c:F

    return-void
.end method

.method public a(FFFF)V
    .locals 1

    .line 8
    iget-object v0, p0, Le/c/a/d2;->a:Landroid/graphics/Path;

    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 9
    iput p3, p0, Le/c/a/d2;->b:F

    .line 10
    iput p4, p0, Le/c/a/d2;->c:F

    return-void
.end method

.method public a(FFFFFF)V
    .locals 7

    .line 5
    iget-object v0, p0, Le/c/a/d2;->a:Landroid/graphics/Path;

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    move v6, p6

    invoke-virtual/range {v0 .. v6}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 6
    iput p5, p0, Le/c/a/d2;->b:F

    .line 7
    iput p6, p0, Le/c/a/d2;->c:F

    return-void
.end method

.method public a(FFFZZFF)V
    .locals 11

    move-object v10, p0

    .line 11
    iget v0, v10, Le/c/a/d2;->b:F

    iget v1, v10, Le/c/a/d2;->c:F

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move-object v9, p0

    invoke-static/range {v0 .. v9}, Le/c/a/l2;->a(FFFFFZZFFLe/c/a/j0;)V

    move/from16 v0, p6

    .line 12
    iput v0, v10, Le/c/a/d2;->b:F

    move/from16 v0, p7

    .line 13
    iput v0, v10, Le/c/a/d2;->c:F

    return-void
.end method

.method public b(FF)V
    .locals 1

    .line 1
    iget-object v0, p0, Le/c/a/d2;->a:Landroid/graphics/Path;

    invoke-virtual {v0, p1, p2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 2
    iput p1, p0, Le/c/a/d2;->b:F

    .line 3
    iput p2, p0, Le/c/a/d2;->c:F

    return-void
.end method

.method public close()V
    .locals 1

    .line 1
    iget-object v0, p0, Le/c/a/d2;->a:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->close()V

    return-void
.end method
