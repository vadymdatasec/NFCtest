.class public Lc/r/d/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc/r/d/y;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc/r/d/a$a;,
        Lc/r/d/a$b;
    }
.end annotation


# instance fields
.field public a:Lc/h/m/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/h/m/d<",
            "Lc/r/d/a$b;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lc/r/d/a$b;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lc/r/d/a$b;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lc/r/d/a$a;

.field public e:Ljava/lang/Runnable;

.field public final f:Z

.field public final g:Lc/r/d/z;

.field public h:I


# direct methods
.method public constructor <init>(Lc/r/d/a$a;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lc/r/d/a;-><init>(Lc/r/d/a$a;Z)V

    return-void
.end method

.method public constructor <init>(Lc/r/d/a$a;Z)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Lc/h/m/e;

    const/16 v1, 0x1e

    invoke-direct {v0, v1}, Lc/h/m/e;-><init>(I)V

    iput-object v0, p0, Lc/r/d/a;->a:Lc/h/m/d;

    .line 4
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lc/r/d/a;->b:Ljava/util/ArrayList;

    .line 5
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lc/r/d/a;->c:Ljava/util/ArrayList;

    const/4 v0, 0x0

    .line 6
    iput v0, p0, Lc/r/d/a;->h:I

    .line 7
    iput-object p1, p0, Lc/r/d/a;->d:Lc/r/d/a$a;

    .line 8
    iput-boolean p2, p0, Lc/r/d/a;->f:Z

    .line 9
    new-instance p1, Lc/r/d/z;

    invoke-direct {p1, p0}, Lc/r/d/z;-><init>(Lc/r/d/y;)V

    iput-object p1, p0, Lc/r/d/a;->g:Lc/r/d/z;

    return-void
.end method


# virtual methods
.method public a(I)I
    .locals 5

    .line 22
    iget-object v0, p0, Lc/r/d/a;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_7

    .line 23
    iget-object v2, p0, Lc/r/d/a;->b:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc/r/d/a$b;

    .line 24
    iget v3, v2, Lc/r/d/a$b;->a:I

    const/4 v4, 0x1

    if-eq v3, v4, :cond_5

    const/4 v4, 0x2

    if-eq v3, v4, :cond_3

    const/16 v4, 0x8

    if-eq v3, v4, :cond_0

    goto :goto_1

    .line 25
    :cond_0
    iget v3, v2, Lc/r/d/a$b;->b:I

    if-ne v3, p1, :cond_1

    .line 26
    iget p1, v2, Lc/r/d/a$b;->d:I

    goto :goto_1

    :cond_1
    if-ge v3, p1, :cond_2

    add-int/lit8 p1, p1, -0x1

    .line 27
    :cond_2
    iget v2, v2, Lc/r/d/a$b;->d:I

    if-gt v2, p1, :cond_6

    add-int/lit8 p1, p1, 0x1

    goto :goto_1

    .line 28
    :cond_3
    iget v3, v2, Lc/r/d/a$b;->b:I

    if-gt v3, p1, :cond_6

    .line 29
    iget v2, v2, Lc/r/d/a$b;->d:I

    add-int/2addr v3, v2

    if-le v3, p1, :cond_4

    const/4 p1, -0x1

    return p1

    :cond_4
    sub-int/2addr p1, v2

    goto :goto_1

    .line 30
    :cond_5
    iget v3, v2, Lc/r/d/a$b;->b:I

    if-gt v3, p1, :cond_6

    .line 31
    iget v2, v2, Lc/r/d/a$b;->d:I

    add-int/2addr p1, v2

    :cond_6
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_7
    return p1
.end method

.method public a(II)I
    .locals 5

    .line 10
    iget-object v0, p0, Lc/r/d/a;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    :goto_0
    if-ge p2, v0, :cond_6

    .line 11
    iget-object v1, p0, Lc/r/d/a;->c:Ljava/util/ArrayList;

    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/r/d/a$b;

    .line 12
    iget v2, v1, Lc/r/d/a$b;->a:I

    const/16 v3, 0x8

    if-ne v2, v3, :cond_2

    .line 13
    iget v2, v1, Lc/r/d/a$b;->b:I

    if-ne v2, p1, :cond_0

    .line 14
    iget p1, v1, Lc/r/d/a$b;->d:I

    goto :goto_1

    :cond_0
    if-ge v2, p1, :cond_1

    add-int/lit8 p1, p1, -0x1

    .line 15
    :cond_1
    iget v1, v1, Lc/r/d/a$b;->d:I

    if-gt v1, p1, :cond_5

    add-int/lit8 p1, p1, 0x1

    goto :goto_1

    .line 16
    :cond_2
    iget v3, v1, Lc/r/d/a$b;->b:I

    if-gt v3, p1, :cond_5

    const/4 v4, 0x2

    if-ne v2, v4, :cond_4

    .line 17
    iget v1, v1, Lc/r/d/a$b;->d:I

    add-int/2addr v3, v1

    if-ge p1, v3, :cond_3

    const/4 p1, -0x1

    return p1

    :cond_3
    sub-int/2addr p1, v1

    goto :goto_1

    :cond_4
    const/4 v3, 0x1

    if-ne v2, v3, :cond_5

    .line 18
    iget v1, v1, Lc/r/d/a$b;->d:I

    add-int/2addr p1, v1

    :cond_5
    :goto_1
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_6
    return p1
.end method

.method public a(IIILjava/lang/Object;)Lc/r/d/a$b;
    .locals 1

    .line 32
    iget-object v0, p0, Lc/r/d/a;->a:Lc/h/m/d;

    invoke-interface {v0}, Lc/h/m/d;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/r/d/a$b;

    if-nez v0, :cond_0

    .line 33
    new-instance v0, Lc/r/d/a$b;

    invoke-direct {v0, p1, p2, p3, p4}, Lc/r/d/a$b;-><init>(IIILjava/lang/Object;)V

    goto :goto_0

    .line 34
    :cond_0
    iput p1, v0, Lc/r/d/a$b;->a:I

    .line 35
    iput p2, v0, Lc/r/d/a$b;->b:I

    .line 36
    iput p3, v0, Lc/r/d/a$b;->d:I

    .line 37
    iput-object p4, v0, Lc/r/d/a$b;->c:Ljava/lang/Object;

    :goto_0
    return-object v0
.end method

.method public a()V
    .locals 5

    .line 1
    iget-object v0, p0, Lc/r/d/a;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    .line 2
    iget-object v3, p0, Lc/r/d/a;->d:Lc/r/d/a$a;

    iget-object v4, p0, Lc/r/d/a;->c:Ljava/util/ArrayList;

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lc/r/d/a$b;

    invoke-interface {v3, v4}, Lc/r/d/a$a;->a(Lc/r/d/a$b;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lc/r/d/a;->c:Ljava/util/ArrayList;

    invoke-virtual {p0, v0}, Lc/r/d/a;->a(Ljava/util/List;)V

    .line 4
    iput v1, p0, Lc/r/d/a;->h:I

    return-void
.end method

.method public a(Lc/r/d/a$b;)V
    .locals 1

    .line 38
    iget-boolean v0, p0, Lc/r/d/a;->f:Z

    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 39
    iput-object v0, p1, Lc/r/d/a$b;->c:Ljava/lang/Object;

    .line 40
    iget-object v0, p0, Lc/r/d/a;->a:Lc/h/m/d;

    invoke-interface {v0, p1}, Lc/h/m/d;->a(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public a(Lc/r/d/a$b;I)V
    .locals 2

    .line 5
    iget-object v0, p0, Lc/r/d/a;->d:Lc/r/d/a$a;

    invoke-interface {v0, p1}, Lc/r/d/a$a;->b(Lc/r/d/a$b;)V

    .line 6
    iget v0, p1, Lc/r/d/a$b;->a:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    .line 7
    iget-object v0, p0, Lc/r/d/a;->d:Lc/r/d/a$a;

    iget v1, p1, Lc/r/d/a$b;->d:I

    iget-object p1, p1, Lc/r/d/a$b;->c:Ljava/lang/Object;

    invoke-interface {v0, p2, v1, p1}, Lc/r/d/a$a;->a(IILjava/lang/Object;)V

    goto :goto_0

    .line 8
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "only remove and update ops can be dispatched in first pass"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 9
    :cond_1
    iget-object v0, p0, Lc/r/d/a;->d:Lc/r/d/a$a;

    iget p1, p1, Lc/r/d/a$b;->d:I

    invoke-interface {v0, p2, p1}, Lc/r/d/a$a;->b(II)V

    :goto_0
    return-void
.end method

.method public a(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lc/r/d/a$b;",
            ">;)V"
        }
    .end annotation

    .line 41
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 42
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc/r/d/a$b;

    invoke-virtual {p0, v2}, Lc/r/d/a;->a(Lc/r/d/a$b;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 43
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->clear()V

    return-void
.end method

.method public a(IILjava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-ge p2, v1, :cond_0

    return v0

    .line 19
    :cond_0
    iget-object v2, p0, Lc/r/d/a;->b:Ljava/util/ArrayList;

    const/4 v3, 0x4

    invoke-virtual {p0, v3, p1, p2, p3}, Lc/r/d/a;->a(IIILjava/lang/Object;)Lc/r/d/a$b;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 20
    iget p1, p0, Lc/r/d/a;->h:I

    or-int/2addr p1, v3

    iput p1, p0, Lc/r/d/a;->h:I

    .line 21
    iget-object p1, p0, Lc/r/d/a;->b:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-ne p1, v1, :cond_1

    const/4 v0, 0x1

    :cond_1
    return v0
.end method

.method public final b(II)I
    .locals 7

    .line 1
    iget-object v0, p0, Lc/r/d/a;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    :goto_0
    const/16 v2, 0x8

    if-ltz v0, :cond_d

    .line 2
    iget-object v3, p0, Lc/r/d/a;->c:Ljava/util/ArrayList;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lc/r/d/a$b;

    .line 3
    iget v4, v3, Lc/r/d/a$b;->a:I

    const/4 v5, 0x2

    if-ne v4, v2, :cond_8

    .line 4
    iget v2, v3, Lc/r/d/a$b;->b:I

    iget v4, v3, Lc/r/d/a$b;->d:I

    if-ge v2, v4, :cond_0

    goto :goto_1

    :cond_0
    move v6, v4

    move v4, v2

    move v2, v6

    :goto_1
    if-lt p1, v2, :cond_6

    if-gt p1, v4, :cond_6

    .line 5
    iget v4, v3, Lc/r/d/a$b;->b:I

    if-ne v2, v4, :cond_3

    if-ne p2, v1, :cond_1

    .line 6
    iget v2, v3, Lc/r/d/a$b;->d:I

    add-int/2addr v2, v1

    iput v2, v3, Lc/r/d/a$b;->d:I

    goto :goto_2

    :cond_1
    if-ne p2, v5, :cond_2

    .line 7
    iget v2, v3, Lc/r/d/a$b;->d:I

    sub-int/2addr v2, v1

    iput v2, v3, Lc/r/d/a$b;->d:I

    :cond_2
    :goto_2
    add-int/lit8 p1, p1, 0x1

    goto :goto_4

    :cond_3
    if-ne p2, v1, :cond_4

    add-int/lit8 v4, v4, 0x1

    .line 8
    iput v4, v3, Lc/r/d/a$b;->b:I

    goto :goto_3

    :cond_4
    if-ne p2, v5, :cond_5

    add-int/lit8 v4, v4, -0x1

    .line 9
    iput v4, v3, Lc/r/d/a$b;->b:I

    :cond_5
    :goto_3
    add-int/lit8 p1, p1, -0x1

    goto :goto_4

    .line 10
    :cond_6
    iget v2, v3, Lc/r/d/a$b;->b:I

    if-ge p1, v2, :cond_c

    if-ne p2, v1, :cond_7

    add-int/lit8 v2, v2, 0x1

    .line 11
    iput v2, v3, Lc/r/d/a$b;->b:I

    .line 12
    iget v2, v3, Lc/r/d/a$b;->d:I

    add-int/2addr v2, v1

    iput v2, v3, Lc/r/d/a$b;->d:I

    goto :goto_4

    :cond_7
    if-ne p2, v5, :cond_c

    add-int/lit8 v2, v2, -0x1

    .line 13
    iput v2, v3, Lc/r/d/a$b;->b:I

    .line 14
    iget v2, v3, Lc/r/d/a$b;->d:I

    sub-int/2addr v2, v1

    iput v2, v3, Lc/r/d/a$b;->d:I

    goto :goto_4

    .line 15
    :cond_8
    iget v2, v3, Lc/r/d/a$b;->b:I

    if-gt v2, p1, :cond_a

    if-ne v4, v1, :cond_9

    .line 16
    iget v2, v3, Lc/r/d/a$b;->d:I

    sub-int/2addr p1, v2

    goto :goto_4

    :cond_9
    if-ne v4, v5, :cond_c

    .line 17
    iget v2, v3, Lc/r/d/a$b;->d:I

    add-int/2addr p1, v2

    goto :goto_4

    :cond_a
    if-ne p2, v1, :cond_b

    add-int/lit8 v2, v2, 0x1

    .line 18
    iput v2, v3, Lc/r/d/a$b;->b:I

    goto :goto_4

    :cond_b
    if-ne p2, v5, :cond_c

    add-int/lit8 v2, v2, -0x1

    .line 19
    iput v2, v3, Lc/r/d/a$b;->b:I

    :cond_c
    :goto_4
    add-int/lit8 v0, v0, -0x1

    goto/16 :goto_0

    .line 20
    :cond_d
    iget-object p2, p0, Lc/r/d/a;->c:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    sub-int/2addr p2, v1

    :goto_5
    if-ltz p2, :cond_11

    .line 21
    iget-object v0, p0, Lc/r/d/a;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/r/d/a$b;

    .line 22
    iget v1, v0, Lc/r/d/a$b;->a:I

    if-ne v1, v2, :cond_f

    .line 23
    iget v1, v0, Lc/r/d/a$b;->d:I

    iget v3, v0, Lc/r/d/a$b;->b:I

    if-eq v1, v3, :cond_e

    if-gez v1, :cond_10

    .line 24
    :cond_e
    iget-object v1, p0, Lc/r/d/a;->c:Ljava/util/ArrayList;

    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 25
    invoke-virtual {p0, v0}, Lc/r/d/a;->a(Lc/r/d/a$b;)V

    goto :goto_6

    .line 26
    :cond_f
    iget v1, v0, Lc/r/d/a$b;->d:I

    if-gtz v1, :cond_10

    .line 27
    iget-object v1, p0, Lc/r/d/a;->c:Ljava/util/ArrayList;

    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 28
    invoke-virtual {p0, v0}, Lc/r/d/a;->a(Lc/r/d/a$b;)V

    :cond_10
    :goto_6
    add-int/lit8 p2, p2, -0x1

    goto :goto_5

    :cond_11
    return p1
.end method

.method public b()V
    .locals 7

    .line 36
    invoke-virtual {p0}, Lc/r/d/a;->a()V

    .line 37
    iget-object v0, p0, Lc/r/d/a;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_5

    .line 38
    iget-object v3, p0, Lc/r/d/a;->b:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lc/r/d/a$b;

    .line 39
    iget v4, v3, Lc/r/d/a$b;->a:I

    const/4 v5, 0x1

    if-eq v4, v5, :cond_3

    const/4 v5, 0x2

    if-eq v4, v5, :cond_2

    const/4 v5, 0x4

    if-eq v4, v5, :cond_1

    const/16 v5, 0x8

    if-eq v4, v5, :cond_0

    goto :goto_1

    .line 40
    :cond_0
    iget-object v4, p0, Lc/r/d/a;->d:Lc/r/d/a$a;

    invoke-interface {v4, v3}, Lc/r/d/a$a;->a(Lc/r/d/a$b;)V

    .line 41
    iget-object v4, p0, Lc/r/d/a;->d:Lc/r/d/a$a;

    iget v5, v3, Lc/r/d/a$b;->b:I

    iget v3, v3, Lc/r/d/a$b;->d:I

    invoke-interface {v4, v5, v3}, Lc/r/d/a$a;->a(II)V

    goto :goto_1

    .line 42
    :cond_1
    iget-object v4, p0, Lc/r/d/a;->d:Lc/r/d/a$a;

    invoke-interface {v4, v3}, Lc/r/d/a$a;->a(Lc/r/d/a$b;)V

    .line 43
    iget-object v4, p0, Lc/r/d/a;->d:Lc/r/d/a$a;

    iget v5, v3, Lc/r/d/a$b;->b:I

    iget v6, v3, Lc/r/d/a$b;->d:I

    iget-object v3, v3, Lc/r/d/a$b;->c:Ljava/lang/Object;

    invoke-interface {v4, v5, v6, v3}, Lc/r/d/a$a;->a(IILjava/lang/Object;)V

    goto :goto_1

    .line 44
    :cond_2
    iget-object v4, p0, Lc/r/d/a;->d:Lc/r/d/a$a;

    invoke-interface {v4, v3}, Lc/r/d/a$a;->a(Lc/r/d/a$b;)V

    .line 45
    iget-object v4, p0, Lc/r/d/a;->d:Lc/r/d/a$a;

    iget v5, v3, Lc/r/d/a$b;->b:I

    iget v3, v3, Lc/r/d/a$b;->d:I

    invoke-interface {v4, v5, v3}, Lc/r/d/a$a;->b(II)V

    goto :goto_1

    .line 46
    :cond_3
    iget-object v4, p0, Lc/r/d/a;->d:Lc/r/d/a$a;

    invoke-interface {v4, v3}, Lc/r/d/a$a;->a(Lc/r/d/a$b;)V

    .line 47
    iget-object v4, p0, Lc/r/d/a;->d:Lc/r/d/a$a;

    iget v5, v3, Lc/r/d/a$b;->b:I

    iget v3, v3, Lc/r/d/a$b;->d:I

    invoke-interface {v4, v5, v3}, Lc/r/d/a$a;->d(II)V

    .line 48
    :goto_1
    iget-object v3, p0, Lc/r/d/a;->e:Ljava/lang/Runnable;

    if-eqz v3, :cond_4

    .line 49
    invoke-interface {v3}, Ljava/lang/Runnable;->run()V

    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 50
    :cond_5
    iget-object v0, p0, Lc/r/d/a;->b:Ljava/util/ArrayList;

    invoke-virtual {p0, v0}, Lc/r/d/a;->a(Ljava/util/List;)V

    .line 51
    iput v1, p0, Lc/r/d/a;->h:I

    return-void
.end method

.method public final b(Lc/r/d/a$b;)V
    .locals 0

    .line 35
    invoke-virtual {p0, p1}, Lc/r/d/a;->g(Lc/r/d/a$b;)V

    return-void
.end method

.method public final b(I)Z
    .locals 7

    .line 29
    iget-object v0, p0, Lc/r/d/a;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_3

    .line 30
    iget-object v3, p0, Lc/r/d/a;->c:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lc/r/d/a$b;

    .line 31
    iget v4, v3, Lc/r/d/a$b;->a:I

    const/16 v5, 0x8

    const/4 v6, 0x1

    if-ne v4, v5, :cond_0

    .line 32
    iget v3, v3, Lc/r/d/a$b;->d:I

    add-int/lit8 v4, v2, 0x1

    invoke-virtual {p0, v3, v4}, Lc/r/d/a;->a(II)I

    move-result v3

    if-ne v3, p1, :cond_2

    return v6

    :cond_0
    if-ne v4, v6, :cond_2

    .line 33
    iget v4, v3, Lc/r/d/a$b;->b:I

    iget v3, v3, Lc/r/d/a$b;->d:I

    add-int/2addr v3, v4

    :goto_1
    if-ge v4, v3, :cond_2

    add-int/lit8 v5, v2, 0x1

    .line 34
    invoke-virtual {p0, v4, v5}, Lc/r/d/a;->a(II)I

    move-result v5

    if-ne v5, p1, :cond_1

    return v6

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    return v1
.end method

.method public c(I)I
    .locals 1

    const/4 v0, 0x0

    .line 3
    invoke-virtual {p0, p1, v0}, Lc/r/d/a;->a(II)I

    move-result p1

    return p1
.end method

.method public final c(Lc/r/d/a$b;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lc/r/d/a;->g(Lc/r/d/a$b;)V

    return-void
.end method

.method public c()Z
    .locals 1

    .line 2
    iget-object v0, p0, Lc/r/d/a;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final d(Lc/r/d/a$b;)V
    .locals 10

    .line 1
    iget v0, p1, Lc/r/d/a$b;->b:I

    .line 2
    iget v1, p1, Lc/r/d/a$b;->d:I

    add-int/2addr v1, v0

    const/4 v2, 0x0

    const/4 v3, -0x1

    move v4, v0

    const/4 v5, 0x0

    :goto_0
    const/4 v6, 0x0

    const/4 v7, 0x2

    if-ge v4, v1, :cond_5

    .line 3
    iget-object v8, p0, Lc/r/d/a;->d:Lc/r/d/a$a;

    invoke-interface {v8, v4}, Lc/r/d/a$a;->a(I)Landroidx/recyclerview/widget/RecyclerView$d0;

    move-result-object v8

    const/4 v9, 0x1

    if-nez v8, :cond_2

    .line 4
    invoke-virtual {p0, v4}, Lc/r/d/a;->b(I)Z

    move-result v8

    if-eqz v8, :cond_0

    goto :goto_2

    :cond_0
    if-ne v3, v9, :cond_1

    .line 5
    invoke-virtual {p0, v7, v0, v5, v6}, Lc/r/d/a;->a(IIILjava/lang/Object;)Lc/r/d/a$b;

    move-result-object v3

    .line 6
    invoke-virtual {p0, v3}, Lc/r/d/a;->g(Lc/r/d/a$b;)V

    const/4 v3, 0x1

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    const/4 v6, 0x0

    goto :goto_4

    :cond_2
    :goto_2
    if-nez v3, :cond_3

    .line 7
    invoke-virtual {p0, v7, v0, v5, v6}, Lc/r/d/a;->a(IIILjava/lang/Object;)Lc/r/d/a$b;

    move-result-object v3

    .line 8
    invoke-virtual {p0, v3}, Lc/r/d/a;->f(Lc/r/d/a$b;)V

    const/4 v3, 0x1

    goto :goto_3

    :cond_3
    const/4 v3, 0x0

    :goto_3
    const/4 v6, 0x1

    :goto_4
    if-eqz v3, :cond_4

    sub-int/2addr v4, v5

    sub-int/2addr v1, v5

    const/4 v5, 0x1

    goto :goto_5

    :cond_4
    add-int/lit8 v5, v5, 0x1

    :goto_5
    add-int/2addr v4, v9

    move v3, v6

    goto :goto_0

    .line 9
    :cond_5
    iget v1, p1, Lc/r/d/a$b;->d:I

    if-eq v5, v1, :cond_6

    .line 10
    invoke-virtual {p0, p1}, Lc/r/d/a;->a(Lc/r/d/a$b;)V

    .line 11
    invoke-virtual {p0, v7, v0, v5, v6}, Lc/r/d/a;->a(IIILjava/lang/Object;)Lc/r/d/a$b;

    move-result-object p1

    :cond_6
    if-nez v3, :cond_7

    .line 12
    invoke-virtual {p0, p1}, Lc/r/d/a;->f(Lc/r/d/a$b;)V

    goto :goto_6

    .line 13
    :cond_7
    invoke-virtual {p0, p1}, Lc/r/d/a;->g(Lc/r/d/a$b;)V

    :goto_6
    return-void
.end method

.method public d()Z
    .locals 1

    .line 15
    iget-object v0, p0, Lc/r/d/a;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lc/r/d/a;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public d(I)Z
    .locals 1

    .line 14
    iget v0, p0, Lc/r/d/a;->h:I

    and-int/2addr p1, v0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public e()V
    .locals 5

    .line 1
    iget-object v0, p0, Lc/r/d/a;->g:Lc/r/d/z;

    iget-object v1, p0, Lc/r/d/a;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Lc/r/d/z;->b(Ljava/util/List;)V

    .line 2
    iget-object v0, p0, Lc/r/d/a;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_5

    .line 3
    iget-object v2, p0, Lc/r/d/a;->b:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc/r/d/a$b;

    .line 4
    iget v3, v2, Lc/r/d/a$b;->a:I

    const/4 v4, 0x1

    if-eq v3, v4, :cond_3

    const/4 v4, 0x2

    if-eq v3, v4, :cond_2

    const/4 v4, 0x4

    if-eq v3, v4, :cond_1

    const/16 v4, 0x8

    if-eq v3, v4, :cond_0

    goto :goto_1

    .line 5
    :cond_0
    invoke-virtual {p0, v2}, Lc/r/d/a;->c(Lc/r/d/a$b;)V

    goto :goto_1

    .line 6
    :cond_1
    invoke-virtual {p0, v2}, Lc/r/d/a;->e(Lc/r/d/a$b;)V

    goto :goto_1

    .line 7
    :cond_2
    invoke-virtual {p0, v2}, Lc/r/d/a;->d(Lc/r/d/a$b;)V

    goto :goto_1

    .line 8
    :cond_3
    invoke-virtual {p0, v2}, Lc/r/d/a;->b(Lc/r/d/a$b;)V

    .line 9
    :goto_1
    iget-object v2, p0, Lc/r/d/a;->e:Ljava/lang/Runnable;

    if-eqz v2, :cond_4

    .line 10
    invoke-interface {v2}, Ljava/lang/Runnable;->run()V

    :cond_4
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 11
    :cond_5
    iget-object v0, p0, Lc/r/d/a;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method public final e(Lc/r/d/a$b;)V
    .locals 9

    .line 12
    iget v0, p1, Lc/r/d/a$b;->b:I

    .line 13
    iget v1, p1, Lc/r/d/a$b;->d:I

    add-int/2addr v1, v0

    const/4 v2, 0x0

    const/4 v3, -0x1

    move v3, v0

    const/4 v4, -0x1

    const/4 v5, 0x0

    :goto_0
    const/4 v6, 0x4

    if-ge v0, v1, :cond_4

    .line 14
    iget-object v7, p0, Lc/r/d/a;->d:Lc/r/d/a$a;

    invoke-interface {v7, v0}, Lc/r/d/a$a;->a(I)Landroidx/recyclerview/widget/RecyclerView$d0;

    move-result-object v7

    const/4 v8, 0x1

    if-nez v7, :cond_2

    .line 15
    invoke-virtual {p0, v0}, Lc/r/d/a;->b(I)Z

    move-result v7

    if-eqz v7, :cond_0

    goto :goto_1

    :cond_0
    if-ne v4, v8, :cond_1

    .line 16
    iget-object v4, p1, Lc/r/d/a$b;->c:Ljava/lang/Object;

    invoke-virtual {p0, v6, v3, v5, v4}, Lc/r/d/a;->a(IIILjava/lang/Object;)Lc/r/d/a$b;

    move-result-object v3

    .line 17
    invoke-virtual {p0, v3}, Lc/r/d/a;->g(Lc/r/d/a$b;)V

    move v3, v0

    const/4 v5, 0x0

    :cond_1
    const/4 v4, 0x0

    goto :goto_2

    :cond_2
    :goto_1
    if-nez v4, :cond_3

    .line 18
    iget-object v4, p1, Lc/r/d/a$b;->c:Ljava/lang/Object;

    invoke-virtual {p0, v6, v3, v5, v4}, Lc/r/d/a;->a(IIILjava/lang/Object;)Lc/r/d/a$b;

    move-result-object v3

    .line 19
    invoke-virtual {p0, v3}, Lc/r/d/a;->f(Lc/r/d/a$b;)V

    move v3, v0

    const/4 v5, 0x0

    :cond_3
    const/4 v4, 0x1

    :goto_2
    add-int/2addr v5, v8

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 20
    :cond_4
    iget v0, p1, Lc/r/d/a$b;->d:I

    if-eq v5, v0, :cond_5

    .line 21
    iget-object v0, p1, Lc/r/d/a$b;->c:Ljava/lang/Object;

    .line 22
    invoke-virtual {p0, p1}, Lc/r/d/a;->a(Lc/r/d/a$b;)V

    .line 23
    invoke-virtual {p0, v6, v3, v5, v0}, Lc/r/d/a;->a(IIILjava/lang/Object;)Lc/r/d/a$b;

    move-result-object p1

    :cond_5
    if-nez v4, :cond_6

    .line 24
    invoke-virtual {p0, p1}, Lc/r/d/a;->f(Lc/r/d/a$b;)V

    goto :goto_3

    .line 25
    :cond_6
    invoke-virtual {p0, p1}, Lc/r/d/a;->g(Lc/r/d/a$b;)V

    :goto_3
    return-void
.end method

.method public f()V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/r/d/a;->b:Ljava/util/ArrayList;

    invoke-virtual {p0, v0}, Lc/r/d/a;->a(Ljava/util/List;)V

    .line 2
    iget-object v0, p0, Lc/r/d/a;->c:Ljava/util/ArrayList;

    invoke-virtual {p0, v0}, Lc/r/d/a;->a(Ljava/util/List;)V

    const/4 v0, 0x0

    .line 3
    iput v0, p0, Lc/r/d/a;->h:I

    return-void
.end method

.method public final f(Lc/r/d/a$b;)V
    .locals 12

    .line 4
    iget v0, p1, Lc/r/d/a$b;->a:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_9

    const/16 v2, 0x8

    if-eq v0, v2, :cond_9

    .line 5
    iget v2, p1, Lc/r/d/a$b;->b:I

    invoke-virtual {p0, v2, v0}, Lc/r/d/a;->b(II)I

    move-result v0

    .line 6
    iget v2, p1, Lc/r/d/a$b;->b:I

    .line 7
    iget v3, p1, Lc/r/d/a$b;->a:I

    const/4 v4, 0x2

    const/4 v5, 0x4

    const/4 v6, 0x0

    if-eq v3, v4, :cond_1

    if-ne v3, v5, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    .line 8
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "op should be remove or update."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    const/4 v3, 0x0

    :goto_0
    const/4 v7, 0x1

    const/4 v8, 0x1

    .line 9
    :goto_1
    iget v9, p1, Lc/r/d/a$b;->d:I

    if-ge v7, v9, :cond_7

    .line 10
    iget v9, p1, Lc/r/d/a$b;->b:I

    mul-int v10, v3, v7

    add-int/2addr v9, v10

    .line 11
    iget v10, p1, Lc/r/d/a$b;->a:I

    invoke-virtual {p0, v9, v10}, Lc/r/d/a;->b(II)I

    move-result v9

    .line 12
    iget v10, p1, Lc/r/d/a$b;->a:I

    if-eq v10, v4, :cond_4

    if-eq v10, v5, :cond_3

    :cond_2
    const/4 v10, 0x0

    goto :goto_3

    :cond_3
    add-int/lit8 v10, v0, 0x1

    if-ne v9, v10, :cond_2

    :goto_2
    const/4 v10, 0x1

    goto :goto_3

    :cond_4
    if-ne v9, v0, :cond_2

    goto :goto_2

    :goto_3
    if-eqz v10, :cond_5

    add-int/lit8 v8, v8, 0x1

    goto :goto_4

    .line 13
    :cond_5
    iget v10, p1, Lc/r/d/a$b;->a:I

    iget-object v11, p1, Lc/r/d/a$b;->c:Ljava/lang/Object;

    invoke-virtual {p0, v10, v0, v8, v11}, Lc/r/d/a;->a(IIILjava/lang/Object;)Lc/r/d/a$b;

    move-result-object v0

    .line 14
    invoke-virtual {p0, v0, v2}, Lc/r/d/a;->a(Lc/r/d/a$b;I)V

    .line 15
    invoke-virtual {p0, v0}, Lc/r/d/a;->a(Lc/r/d/a$b;)V

    .line 16
    iget v0, p1, Lc/r/d/a$b;->a:I

    if-ne v0, v5, :cond_6

    add-int/2addr v2, v8

    :cond_6
    move v0, v9

    const/4 v8, 0x1

    :goto_4
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    .line 17
    :cond_7
    iget-object v1, p1, Lc/r/d/a$b;->c:Ljava/lang/Object;

    .line 18
    invoke-virtual {p0, p1}, Lc/r/d/a;->a(Lc/r/d/a$b;)V

    if-lez v8, :cond_8

    .line 19
    iget p1, p1, Lc/r/d/a$b;->a:I

    invoke-virtual {p0, p1, v0, v8, v1}, Lc/r/d/a;->a(IIILjava/lang/Object;)Lc/r/d/a$b;

    move-result-object p1

    .line 20
    invoke-virtual {p0, p1, v2}, Lc/r/d/a;->a(Lc/r/d/a$b;I)V

    .line 21
    invoke-virtual {p0, p1}, Lc/r/d/a;->a(Lc/r/d/a$b;)V

    :cond_8
    return-void

    .line 22
    :cond_9
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "should not dispatch add or move for pre layout"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final g(Lc/r/d/a$b;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lc/r/d/a;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2
    iget v0, p1, Lc/r/d/a$b;->a:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    .line 3
    iget-object v0, p0, Lc/r/d/a;->d:Lc/r/d/a$a;

    iget v1, p1, Lc/r/d/a$b;->b:I

    iget p1, p1, Lc/r/d/a$b;->d:I

    invoke-interface {v0, v1, p1}, Lc/r/d/a$a;->a(II)V

    goto :goto_0

    .line 4
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown update op type for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 5
    :cond_1
    iget-object v0, p0, Lc/r/d/a;->d:Lc/r/d/a$a;

    iget v1, p1, Lc/r/d/a$b;->b:I

    iget v2, p1, Lc/r/d/a$b;->d:I

    iget-object p1, p1, Lc/r/d/a$b;->c:Ljava/lang/Object;

    invoke-interface {v0, v1, v2, p1}, Lc/r/d/a$a;->a(IILjava/lang/Object;)V

    goto :goto_0

    .line 6
    :cond_2
    iget-object v0, p0, Lc/r/d/a;->d:Lc/r/d/a$a;

    iget v1, p1, Lc/r/d/a$b;->b:I

    iget p1, p1, Lc/r/d/a$b;->d:I

    invoke-interface {v0, v1, p1}, Lc/r/d/a$a;->c(II)V

    goto :goto_0

    .line 7
    :cond_3
    iget-object v0, p0, Lc/r/d/a;->d:Lc/r/d/a$a;

    iget v1, p1, Lc/r/d/a$b;->b:I

    iget p1, p1, Lc/r/d/a$b;->d:I

    invoke-interface {v0, v1, p1}, Lc/r/d/a$a;->d(II)V

    :goto_0
    return-void
.end method