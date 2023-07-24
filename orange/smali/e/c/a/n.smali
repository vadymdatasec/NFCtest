.class public Le/c/a/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;


# instance fields
.field public b:F

.field public c:F

.field public d:F

.field public e:F


# direct methods
.method public constructor <init>(FFFF)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Le/c/a/n;->b:F

    .line 3
    iput p2, p0, Le/c/a/n;->c:F

    .line 4
    iput p3, p0, Le/c/a/n;->d:F

    .line 5
    iput p4, p0, Le/c/a/n;->e:F

    return-void
.end method

.method public static a(FFFF)Le/c/a/n;
    .locals 1

    .line 1
    new-instance v0, Le/c/a/n;

    sub-float/2addr p2, p0

    sub-float/2addr p3, p1

    invoke-direct {v0, p0, p1, p2, p3}, Le/c/a/n;-><init>(FFFF)V

    return-object v0
.end method


# virtual methods
.method public a()F
    .locals 2

    .line 2
    iget v0, p0, Le/c/a/n;->b:F

    iget v1, p0, Le/c/a/n;->d:F

    add-float/2addr v0, v1

    return v0
.end method

.method public a(Le/c/a/n;)V
    .locals 2

    .line 3
    iget v0, p1, Le/c/a/n;->b:F

    iget v1, p0, Le/c/a/n;->b:F

    cmpg-float v1, v0, v1

    if-gez v1, :cond_0

    iput v0, p0, Le/c/a/n;->b:F

    .line 4
    :cond_0
    iget v0, p1, Le/c/a/n;->c:F

    iget v1, p0, Le/c/a/n;->c:F

    cmpg-float v1, v0, v1

    if-gez v1, :cond_1

    iput v0, p0, Le/c/a/n;->c:F

    .line 5
    :cond_1
    invoke-virtual {p1}, Le/c/a/n;->a()F

    move-result v0

    invoke-virtual {p0}, Le/c/a/n;->a()F

    move-result v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_2

    invoke-virtual {p1}, Le/c/a/n;->a()F

    move-result v0

    iget v1, p0, Le/c/a/n;->b:F

    sub-float/2addr v0, v1

    iput v0, p0, Le/c/a/n;->d:F

    .line 6
    :cond_2
    invoke-virtual {p1}, Le/c/a/n;->b()F

    move-result v0

    invoke-virtual {p0}, Le/c/a/n;->b()F

    move-result v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_3

    invoke-virtual {p1}, Le/c/a/n;->b()F

    move-result p1

    iget v0, p0, Le/c/a/n;->c:F

    sub-float/2addr p1, v0

    iput p1, p0, Le/c/a/n;->e:F

    :cond_3
    return-void
.end method

.method public b()F
    .locals 2

    .line 1
    iget v0, p0, Le/c/a/n;->c:F

    iget v1, p0, Le/c/a/n;->e:F

    add-float/2addr v0, v1

    return v0
.end method

.method public d()Landroid/graphics/RectF;
    .locals 5

    .line 1
    new-instance v0, Landroid/graphics/RectF;

    iget v1, p0, Le/c/a/n;->b:F

    iget v2, p0, Le/c/a/n;->c:F

    invoke-virtual {p0}, Le/c/a/n;->a()F

    move-result v3

    invoke-virtual {p0}, Le/c/a/n;->b()F

    move-result v4

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Le/c/a/n;->b:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Le/c/a/n;->c:F

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Le/c/a/n;->d:F

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Le/c/a/n;->e:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
