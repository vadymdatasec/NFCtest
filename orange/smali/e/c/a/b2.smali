.class public Le/c/a/b2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/c/a/j0;


# instance fields
.field public a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Le/c/a/c2;",
            ">;"
        }
    .end annotation
.end field

.field public b:F

.field public c:F

.field public d:Le/c/a/c2;

.field public e:Z

.field public f:Z

.field public g:I

.field public h:Z

.field public final synthetic i:Le/c/a/l2;


# direct methods
.method public constructor <init>(Le/c/a/l2;Le/c/a/i0;)V
    .locals 2

    .line 1
    iput-object p1, p0, Le/c/a/b2;->i:Le/c/a/l2;

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Le/c/a/b2;->a:Ljava/util/List;

    const/4 p1, 0x0

    .line 4
    iput-object p1, p0, Le/c/a/b2;->d:Le/c/a/c2;

    const/4 p1, 0x0

    .line 5
    iput-boolean p1, p0, Le/c/a/b2;->e:Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Le/c/a/b2;->f:Z

    const/4 v0, -0x1

    .line 6
    iput v0, p0, Le/c/a/b2;->g:I

    .line 7
    invoke-virtual {p2, p0}, Le/c/a/i0;->a(Le/c/a/j0;)V

    .line 8
    iget-boolean p2, p0, Le/c/a/b2;->h:Z

    if-eqz p2, :cond_0

    .line 9
    iget-object p2, p0, Le/c/a/b2;->d:Le/c/a/c2;

    iget-object v0, p0, Le/c/a/b2;->a:Ljava/util/List;

    iget v1, p0, Le/c/a/b2;->g:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/c/a/c2;

    invoke-virtual {p2, v0}, Le/c/a/c2;->a(Le/c/a/c2;)V

    .line 10
    iget-object p2, p0, Le/c/a/b2;->a:Ljava/util/List;

    iget v0, p0, Le/c/a/b2;->g:I

    iget-object v1, p0, Le/c/a/b2;->d:Le/c/a/c2;

    invoke-interface {p2, v0, v1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 11
    iput-boolean p1, p0, Le/c/a/b2;->h:Z

    .line 12
    :cond_0
    iget-object p1, p0, Le/c/a/b2;->d:Le/c/a/c2;

    if-eqz p1, :cond_1

    .line 13
    iget-object p2, p0, Le/c/a/b2;->a:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    return-void
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Le/c/a/c2;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/c/a/b2;->a:Ljava/util/List;

    return-object v0
.end method

.method public a(FF)V
    .locals 8

    .line 2
    iget-boolean v0, p0, Le/c/a/b2;->h:Z

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Le/c/a/b2;->d:Le/c/a/c2;

    iget-object v1, p0, Le/c/a/b2;->a:Ljava/util/List;

    iget v2, p0, Le/c/a/b2;->g:I

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le/c/a/c2;

    invoke-virtual {v0, v1}, Le/c/a/c2;->a(Le/c/a/c2;)V

    .line 4
    iget-object v0, p0, Le/c/a/b2;->a:Ljava/util/List;

    iget v1, p0, Le/c/a/b2;->g:I

    iget-object v2, p0, Le/c/a/b2;->d:Le/c/a/c2;

    invoke-interface {v0, v1, v2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Le/c/a/b2;->h:Z

    .line 6
    :cond_0
    iget-object v0, p0, Le/c/a/b2;->d:Le/c/a/c2;

    if-eqz v0, :cond_1

    .line 7
    iget-object v1, p0, Le/c/a/b2;->a:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 8
    :cond_1
    iput p1, p0, Le/c/a/b2;->b:F

    .line 9
    iput p2, p0, Le/c/a/b2;->c:F

    .line 10
    new-instance v0, Le/c/a/c2;

    iget-object v3, p0, Le/c/a/b2;->i:Le/c/a/l2;

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v2, v0

    move v4, p1

    move v5, p2

    invoke-direct/range {v2 .. v7}, Le/c/a/c2;-><init>(Le/c/a/l2;FFFF)V

    iput-object v0, p0, Le/c/a/b2;->d:Le/c/a/c2;

    .line 11
    iget-object p1, p0, Le/c/a/b2;->a:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    iput p1, p0, Le/c/a/b2;->g:I

    return-void
.end method

.method public a(FFFF)V
    .locals 8

    .line 19
    iget-object v0, p0, Le/c/a/b2;->d:Le/c/a/c2;

    invoke-virtual {v0, p1, p2}, Le/c/a/c2;->a(FF)V

    .line 20
    iget-object v0, p0, Le/c/a/b2;->a:Ljava/util/List;

    iget-object v1, p0, Le/c/a/b2;->d:Le/c/a/c2;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 21
    new-instance v0, Le/c/a/c2;

    iget-object v3, p0, Le/c/a/b2;->i:Le/c/a/l2;

    sub-float v6, p3, p1

    sub-float v7, p4, p2

    move-object v2, v0

    move v4, p3

    move v5, p4

    invoke-direct/range {v2 .. v7}, Le/c/a/c2;-><init>(Le/c/a/l2;FFFF)V

    .line 22
    iput-object v0, p0, Le/c/a/b2;->d:Le/c/a/c2;

    const/4 p1, 0x0

    .line 23
    iput-boolean p1, p0, Le/c/a/b2;->h:Z

    return-void
.end method

.method public a(FFFFFF)V
    .locals 8

    .line 12
    iget-boolean v0, p0, Le/c/a/b2;->f:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iget-boolean v0, p0, Le/c/a/b2;->e:Z

    if-eqz v0, :cond_1

    .line 13
    :cond_0
    iget-object v0, p0, Le/c/a/b2;->d:Le/c/a/c2;

    invoke-virtual {v0, p1, p2}, Le/c/a/c2;->a(FF)V

    .line 14
    iget-object p1, p0, Le/c/a/b2;->a:Ljava/util/List;

    iget-object p2, p0, Le/c/a/b2;->d:Le/c/a/c2;

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 15
    iput-boolean v1, p0, Le/c/a/b2;->e:Z

    .line 16
    :cond_1
    new-instance p1, Le/c/a/c2;

    iget-object v3, p0, Le/c/a/b2;->i:Le/c/a/l2;

    sub-float v6, p5, p3

    sub-float v7, p6, p4

    move-object v2, p1

    move v4, p5

    move v5, p6

    invoke-direct/range {v2 .. v7}, Le/c/a/c2;-><init>(Le/c/a/l2;FFFF)V

    .line 17
    iput-object p1, p0, Le/c/a/b2;->d:Le/c/a/c2;

    .line 18
    iput-boolean v1, p0, Le/c/a/b2;->h:Z

    return-void
.end method

.method public a(FFFZZFF)V
    .locals 13

    move-object v10, p0

    const/4 v11, 0x1

    .line 24
    iput-boolean v11, v10, Le/c/a/b2;->e:Z

    const/4 v12, 0x0

    .line 25
    iput-boolean v12, v10, Le/c/a/b2;->f:Z

    .line 26
    iget-object v0, v10, Le/c/a/b2;->d:Le/c/a/c2;

    iget v1, v0, Le/c/a/c2;->a:F

    iget v2, v0, Le/c/a/c2;->b:F

    move v0, v1

    move v1, v2

    move v2, p1

    move v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move-object v9, p0

    invoke-static/range {v0 .. v9}, Le/c/a/l2;->a(FFFFFZZFFLe/c/a/j0;)V

    .line 27
    iput-boolean v11, v10, Le/c/a/b2;->f:Z

    .line 28
    iput-boolean v12, v10, Le/c/a/b2;->h:Z

    return-void
.end method

.method public b(FF)V
    .locals 8

    .line 1
    iget-object v0, p0, Le/c/a/b2;->d:Le/c/a/c2;

    invoke-virtual {v0, p1, p2}, Le/c/a/c2;->a(FF)V

    .line 2
    iget-object v0, p0, Le/c/a/b2;->a:Ljava/util/List;

    iget-object v1, p0, Le/c/a/b2;->d:Le/c/a/c2;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 3
    new-instance v0, Le/c/a/c2;

    iget-object v3, p0, Le/c/a/b2;->i:Le/c/a/l2;

    iget-object v1, p0, Le/c/a/b2;->d:Le/c/a/c2;

    iget v2, v1, Le/c/a/c2;->a:F

    sub-float v6, p1, v2

    iget v1, v1, Le/c/a/c2;->b:F

    sub-float v7, p2, v1

    move-object v2, v0

    move v4, p1

    move v5, p2

    invoke-direct/range {v2 .. v7}, Le/c/a/c2;-><init>(Le/c/a/l2;FFFF)V

    .line 4
    iput-object v0, p0, Le/c/a/b2;->d:Le/c/a/c2;

    const/4 p1, 0x0

    .line 5
    iput-boolean p1, p0, Le/c/a/b2;->h:Z

    return-void
.end method

.method public close()V
    .locals 2

    .line 1
    iget-object v0, p0, Le/c/a/b2;->a:Ljava/util/List;

    iget-object v1, p0, Le/c/a/b2;->d:Le/c/a/c2;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2
    iget v0, p0, Le/c/a/b2;->b:F

    iget v1, p0, Le/c/a/b2;->c:F

    invoke-virtual {p0, v0, v1}, Le/c/a/b2;->b(FF)V

    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Le/c/a/b2;->h:Z

    return-void
.end method
