.class public Lc/f/a/l/q;
.super Lc/f/a/l/s;
.source "SourceFile"


# instance fields
.field public c:Lc/f/a/l/g;

.field public d:Lc/f/a/l/q;

.field public e:F

.field public f:Lc/f/a/l/q;

.field public g:F

.field public h:I

.field public i:Lc/f/a/l/q;

.field public j:Lc/f/a/l/r;

.field public k:I

.field public l:Lc/f/a/l/r;

.field public m:I


# direct methods
.method public constructor <init>(Lc/f/a/l/g;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lc/f/a/l/s;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lc/f/a/l/q;->h:I

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lc/f/a/l/q;->j:Lc/f/a/l/r;

    const/4 v1, 0x1

    .line 4
    iput v1, p0, Lc/f/a/l/q;->k:I

    .line 5
    iput-object v0, p0, Lc/f/a/l/q;->l:Lc/f/a/l/r;

    .line 6
    iput v1, p0, Lc/f/a/l/q;->m:I

    .line 7
    iput-object p1, p0, Lc/f/a/l/q;->c:Lc/f/a/l/g;

    return-void
.end method


# virtual methods
.method public a(I)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    const-string p1, "DIRECT"

    return-object p1

    :cond_0
    const/4 v0, 0x2

    if-ne p1, v0, :cond_1

    const-string p1, "CENTER"

    return-object p1

    :cond_1
    const/4 v0, 0x3

    if-ne p1, v0, :cond_2

    const-string p1, "MATCH"

    return-object p1

    :cond_2
    const/4 v0, 0x4

    if-ne p1, v0, :cond_3

    const-string p1, "CHAIN"

    return-object p1

    :cond_3
    const/4 v0, 0x5

    if-ne p1, v0, :cond_4

    const-string p1, "BARRIER"

    return-object p1

    :cond_4
    const-string p1, "UNCONNECTED"

    return-object p1
.end method

.method public a(ILc/f/a/l/q;I)V
    .locals 0

    .line 7
    iput p1, p0, Lc/f/a/l/q;->h:I

    .line 8
    iput-object p2, p0, Lc/f/a/l/q;->d:Lc/f/a/l/q;

    int-to-float p1, p3

    .line 9
    iput p1, p0, Lc/f/a/l/q;->e:F

    .line 10
    invoke-virtual {p2, p0}, Lc/f/a/l/s;->a(Lc/f/a/l/s;)V

    return-void
.end method

.method public a(Lc/f/a/f;)V
    .locals 4

    .line 19
    iget-object v0, p0, Lc/f/a/l/q;->c:Lc/f/a/l/g;

    invoke-virtual {v0}, Lc/f/a/l/g;->e()Lc/f/a/k;

    move-result-object v0

    .line 20
    iget-object v1, p0, Lc/f/a/l/q;->f:Lc/f/a/l/q;

    const/high16 v2, 0x3f000000    # 0.5f

    if-nez v1, :cond_0

    .line 21
    iget v1, p0, Lc/f/a/l/q;->g:F

    add-float/2addr v1, v2

    float-to-int v1, v1

    invoke-virtual {p1, v0, v1}, Lc/f/a/f;->a(Lc/f/a/k;I)V

    goto :goto_0

    .line 22
    :cond_0
    iget-object v1, v1, Lc/f/a/l/q;->c:Lc/f/a/l/g;

    invoke-virtual {p1, v1}, Lc/f/a/f;->a(Ljava/lang/Object;)Lc/f/a/k;

    move-result-object v1

    .line 23
    iget v3, p0, Lc/f/a/l/q;->g:F

    add-float/2addr v3, v2

    float-to-int v2, v3

    const/4 v3, 0x6

    invoke-virtual {p1, v0, v1, v2, v3}, Lc/f/a/f;->a(Lc/f/a/k;Lc/f/a/k;II)Lc/f/a/b;

    :goto_0
    return-void
.end method

.method public a(Lc/f/a/l/q;F)V
    .locals 1

    .line 1
    iget v0, p0, Lc/f/a/l/s;->b:I

    if-eqz v0, :cond_0

    iget-object v0, p0, Lc/f/a/l/q;->f:Lc/f/a/l/q;

    if-eq v0, p1, :cond_2

    iget v0, p0, Lc/f/a/l/q;->g:F

    cmpl-float v0, v0, p2

    if-eqz v0, :cond_2

    .line 2
    :cond_0
    iput-object p1, p0, Lc/f/a/l/q;->f:Lc/f/a/l/q;

    .line 3
    iput p2, p0, Lc/f/a/l/q;->g:F

    .line 4
    iget p1, p0, Lc/f/a/l/s;->b:I

    const/4 p2, 0x1

    if-ne p1, p2, :cond_1

    .line 5
    invoke-virtual {p0}, Lc/f/a/l/s;->b()V

    .line 6
    :cond_1
    invoke-virtual {p0}, Lc/f/a/l/s;->a()V

    :cond_2
    return-void
.end method

.method public a(Lc/f/a/l/q;I)V
    .locals 0

    .line 11
    iput-object p1, p0, Lc/f/a/l/q;->d:Lc/f/a/l/q;

    int-to-float p2, p2

    .line 12
    iput p2, p0, Lc/f/a/l/q;->e:F

    .line 13
    invoke-virtual {p1, p0}, Lc/f/a/l/s;->a(Lc/f/a/l/s;)V

    return-void
.end method

.method public a(Lc/f/a/l/q;ILc/f/a/l/r;)V
    .locals 0

    .line 14
    iput-object p1, p0, Lc/f/a/l/q;->d:Lc/f/a/l/q;

    .line 15
    invoke-virtual {p1, p0}, Lc/f/a/l/s;->a(Lc/f/a/l/s;)V

    .line 16
    iput-object p3, p0, Lc/f/a/l/q;->j:Lc/f/a/l/r;

    .line 17
    iput p2, p0, Lc/f/a/l/q;->k:I

    .line 18
    invoke-virtual {p3, p0}, Lc/f/a/l/s;->a(Lc/f/a/l/s;)V

    return-void
.end method

.method public b(I)V
    .locals 0

    .line 1
    iput p1, p0, Lc/f/a/l/q;->h:I

    return-void
.end method

.method public b(Lc/f/a/l/q;F)V
    .locals 0

    .line 2
    iput-object p1, p0, Lc/f/a/l/q;->i:Lc/f/a/l/q;

    return-void
.end method

.method public b(Lc/f/a/l/q;ILc/f/a/l/r;)V
    .locals 0

    .line 3
    iput-object p1, p0, Lc/f/a/l/q;->i:Lc/f/a/l/q;

    .line 4
    iput-object p3, p0, Lc/f/a/l/q;->l:Lc/f/a/l/r;

    .line 5
    iput p2, p0, Lc/f/a/l/q;->m:I

    return-void
.end method

.method public d()V
    .locals 3

    .line 1
    invoke-super {p0}, Lc/f/a/l/s;->d()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lc/f/a/l/q;->d:Lc/f/a/l/q;

    const/4 v1, 0x0

    .line 3
    iput v1, p0, Lc/f/a/l/q;->e:F

    .line 4
    iput-object v0, p0, Lc/f/a/l/q;->j:Lc/f/a/l/r;

    const/4 v2, 0x1

    .line 5
    iput v2, p0, Lc/f/a/l/q;->k:I

    .line 6
    iput-object v0, p0, Lc/f/a/l/q;->l:Lc/f/a/l/r;

    .line 7
    iput v2, p0, Lc/f/a/l/q;->m:I

    .line 8
    iput-object v0, p0, Lc/f/a/l/q;->f:Lc/f/a/l/q;

    .line 9
    iput v1, p0, Lc/f/a/l/q;->g:F

    .line 10
    iput-object v0, p0, Lc/f/a/l/q;->i:Lc/f/a/l/q;

    const/4 v0, 0x0

    .line 11
    iput v0, p0, Lc/f/a/l/q;->h:I

    return-void
.end method

.method public e()V
    .locals 8

    .line 1
    iget v0, p0, Lc/f/a/l/s;->b:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return-void

    .line 2
    :cond_0
    iget v0, p0, Lc/f/a/l/q;->h:I

    const/4 v2, 0x4

    if-ne v0, v2, :cond_1

    return-void

    .line 3
    :cond_1
    iget-object v0, p0, Lc/f/a/l/q;->j:Lc/f/a/l/r;

    if-eqz v0, :cond_3

    .line 4
    iget v2, v0, Lc/f/a/l/s;->b:I

    if-eq v2, v1, :cond_2

    return-void

    .line 5
    :cond_2
    iget v2, p0, Lc/f/a/l/q;->k:I

    int-to-float v2, v2

    iget v0, v0, Lc/f/a/l/r;->c:F

    mul-float v2, v2, v0

    iput v2, p0, Lc/f/a/l/q;->e:F

    .line 6
    :cond_3
    iget-object v0, p0, Lc/f/a/l/q;->l:Lc/f/a/l/r;

    if-eqz v0, :cond_5

    .line 7
    iget v2, v0, Lc/f/a/l/s;->b:I

    if-eq v2, v1, :cond_4

    return-void

    .line 8
    :cond_4
    iget v0, v0, Lc/f/a/l/r;->c:F

    .line 9
    :cond_5
    iget v0, p0, Lc/f/a/l/q;->h:I

    if-ne v0, v1, :cond_8

    iget-object v0, p0, Lc/f/a/l/q;->d:Lc/f/a/l/q;

    if-eqz v0, :cond_6

    iget v0, v0, Lc/f/a/l/s;->b:I

    if-ne v0, v1, :cond_8

    .line 10
    :cond_6
    iget-object v0, p0, Lc/f/a/l/q;->d:Lc/f/a/l/q;

    if-nez v0, :cond_7

    .line 11
    iput-object p0, p0, Lc/f/a/l/q;->f:Lc/f/a/l/q;

    .line 12
    iget v0, p0, Lc/f/a/l/q;->e:F

    iput v0, p0, Lc/f/a/l/q;->g:F

    goto :goto_0

    .line 13
    :cond_7
    iget-object v1, v0, Lc/f/a/l/q;->f:Lc/f/a/l/q;

    iput-object v1, p0, Lc/f/a/l/q;->f:Lc/f/a/l/q;

    .line 14
    iget v0, v0, Lc/f/a/l/q;->g:F

    iget v1, p0, Lc/f/a/l/q;->e:F

    add-float/2addr v0, v1

    iput v0, p0, Lc/f/a/l/q;->g:F

    .line 15
    :goto_0
    invoke-virtual {p0}, Lc/f/a/l/s;->a()V

    goto/16 :goto_7

    .line 16
    :cond_8
    iget v0, p0, Lc/f/a/l/q;->h:I

    const/4 v2, 0x2

    const-wide/16 v3, 0x1

    if-ne v0, v2, :cond_11

    iget-object v0, p0, Lc/f/a/l/q;->d:Lc/f/a/l/q;

    if-eqz v0, :cond_11

    iget v0, v0, Lc/f/a/l/s;->b:I

    if-ne v0, v1, :cond_11

    iget-object v0, p0, Lc/f/a/l/q;->i:Lc/f/a/l/q;

    if-eqz v0, :cond_11

    iget-object v0, v0, Lc/f/a/l/q;->d:Lc/f/a/l/q;

    if-eqz v0, :cond_11

    iget v0, v0, Lc/f/a/l/s;->b:I

    if-ne v0, v1, :cond_11

    .line 17
    invoke-static {}, Lc/f/a/f;->j()Lc/f/a/g;

    move-result-object v0

    if-eqz v0, :cond_9

    .line 18
    invoke-static {}, Lc/f/a/f;->j()Lc/f/a/g;

    move-result-object v0

    iget-wide v5, v0, Lc/f/a/g;->v:J

    add-long/2addr v5, v3

    iput-wide v5, v0, Lc/f/a/g;->v:J

    .line 19
    :cond_9
    iget-object v0, p0, Lc/f/a/l/q;->d:Lc/f/a/l/q;

    iget-object v0, v0, Lc/f/a/l/q;->f:Lc/f/a/l/q;

    iput-object v0, p0, Lc/f/a/l/q;->f:Lc/f/a/l/q;

    .line 20
    iget-object v0, p0, Lc/f/a/l/q;->i:Lc/f/a/l/q;

    iget-object v2, v0, Lc/f/a/l/q;->d:Lc/f/a/l/q;

    iget-object v2, v2, Lc/f/a/l/q;->f:Lc/f/a/l/q;

    iput-object v2, v0, Lc/f/a/l/q;->f:Lc/f/a/l/q;

    .line 21
    iget-object v0, p0, Lc/f/a/l/q;->c:Lc/f/a/l/g;

    iget-object v0, v0, Lc/f/a/l/g;->c:Lc/f/a/l/g$b;

    sget-object v2, Lc/f/a/l/g$b;->e:Lc/f/a/l/g$b;

    const/4 v3, 0x0

    if-eq v0, v2, :cond_b

    sget-object v2, Lc/f/a/l/g$b;->f:Lc/f/a/l/g$b;

    if-ne v0, v2, :cond_a

    goto :goto_1

    :cond_a
    const/4 v1, 0x0

    :cond_b
    :goto_1
    if-eqz v1, :cond_c

    .line 22
    iget-object v0, p0, Lc/f/a/l/q;->d:Lc/f/a/l/q;

    iget v0, v0, Lc/f/a/l/q;->g:F

    iget-object v2, p0, Lc/f/a/l/q;->i:Lc/f/a/l/q;

    iget-object v2, v2, Lc/f/a/l/q;->d:Lc/f/a/l/q;

    iget v2, v2, Lc/f/a/l/q;->g:F

    goto :goto_2

    .line 23
    :cond_c
    iget-object v0, p0, Lc/f/a/l/q;->i:Lc/f/a/l/q;

    iget-object v0, v0, Lc/f/a/l/q;->d:Lc/f/a/l/q;

    iget v0, v0, Lc/f/a/l/q;->g:F

    iget-object v2, p0, Lc/f/a/l/q;->d:Lc/f/a/l/q;

    iget v2, v2, Lc/f/a/l/q;->g:F

    :goto_2
    sub-float/2addr v0, v2

    .line 24
    iget-object v2, p0, Lc/f/a/l/q;->c:Lc/f/a/l/g;

    iget-object v4, v2, Lc/f/a/l/g;->c:Lc/f/a/l/g$b;

    sget-object v5, Lc/f/a/l/g$b;->c:Lc/f/a/l/g$b;

    if-eq v4, v5, :cond_e

    sget-object v5, Lc/f/a/l/g$b;->e:Lc/f/a/l/g$b;

    if-ne v4, v5, :cond_d

    goto :goto_3

    .line 25
    :cond_d
    iget-object v2, v2, Lc/f/a/l/g;->b:Lc/f/a/l/i;

    invoke-virtual {v2}, Lc/f/a/l/i;->j()I

    move-result v2

    int-to-float v2, v2

    sub-float/2addr v0, v2

    .line 26
    iget-object v2, p0, Lc/f/a/l/q;->c:Lc/f/a/l/g;

    iget-object v2, v2, Lc/f/a/l/g;->b:Lc/f/a/l/i;

    iget v2, v2, Lc/f/a/l/i;->W:F

    goto :goto_4

    .line 27
    :cond_e
    :goto_3
    iget-object v2, p0, Lc/f/a/l/q;->c:Lc/f/a/l/g;

    iget-object v2, v2, Lc/f/a/l/g;->b:Lc/f/a/l/i;

    invoke-virtual {v2}, Lc/f/a/l/i;->t()I

    move-result v2

    int-to-float v2, v2

    sub-float/2addr v0, v2

    .line 28
    iget-object v2, p0, Lc/f/a/l/q;->c:Lc/f/a/l/g;

    iget-object v2, v2, Lc/f/a/l/g;->b:Lc/f/a/l/i;

    iget v2, v2, Lc/f/a/l/i;->V:F

    .line 29
    :goto_4
    iget-object v4, p0, Lc/f/a/l/q;->c:Lc/f/a/l/g;

    invoke-virtual {v4}, Lc/f/a/l/g;->b()I

    move-result v4

    .line 30
    iget-object v5, p0, Lc/f/a/l/q;->i:Lc/f/a/l/q;

    iget-object v5, v5, Lc/f/a/l/q;->c:Lc/f/a/l/g;

    invoke-virtual {v5}, Lc/f/a/l/g;->b()I

    move-result v5

    .line 31
    iget-object v6, p0, Lc/f/a/l/q;->c:Lc/f/a/l/g;

    invoke-virtual {v6}, Lc/f/a/l/g;->g()Lc/f/a/l/g;

    move-result-object v6

    iget-object v7, p0, Lc/f/a/l/q;->i:Lc/f/a/l/q;

    iget-object v7, v7, Lc/f/a/l/q;->c:Lc/f/a/l/g;

    invoke-virtual {v7}, Lc/f/a/l/g;->g()Lc/f/a/l/g;

    move-result-object v7

    if-ne v6, v7, :cond_f

    const/high16 v2, 0x3f000000    # 0.5f

    const/4 v5, 0x0

    goto :goto_5

    :cond_f
    move v3, v4

    :goto_5
    int-to-float v3, v3

    sub-float/2addr v0, v3

    int-to-float v4, v5

    sub-float/2addr v0, v4

    const/high16 v5, 0x3f800000    # 1.0f

    if-eqz v1, :cond_10

    .line 32
    iget-object v1, p0, Lc/f/a/l/q;->i:Lc/f/a/l/q;

    iget-object v6, v1, Lc/f/a/l/q;->d:Lc/f/a/l/q;

    iget v6, v6, Lc/f/a/l/q;->g:F

    add-float/2addr v6, v4

    mul-float v4, v0, v2

    add-float/2addr v6, v4

    iput v6, v1, Lc/f/a/l/q;->g:F

    .line 33
    iget-object v1, p0, Lc/f/a/l/q;->d:Lc/f/a/l/q;

    iget v1, v1, Lc/f/a/l/q;->g:F

    sub-float/2addr v1, v3

    sub-float/2addr v5, v2

    mul-float v0, v0, v5

    sub-float/2addr v1, v0

    iput v1, p0, Lc/f/a/l/q;->g:F

    goto :goto_6

    .line 34
    :cond_10
    iget-object v1, p0, Lc/f/a/l/q;->d:Lc/f/a/l/q;

    iget v1, v1, Lc/f/a/l/q;->g:F

    add-float/2addr v1, v3

    mul-float v3, v0, v2

    add-float/2addr v1, v3

    iput v1, p0, Lc/f/a/l/q;->g:F

    .line 35
    iget-object v1, p0, Lc/f/a/l/q;->i:Lc/f/a/l/q;

    iget-object v3, v1, Lc/f/a/l/q;->d:Lc/f/a/l/q;

    iget v3, v3, Lc/f/a/l/q;->g:F

    sub-float/2addr v3, v4

    sub-float/2addr v5, v2

    mul-float v0, v0, v5

    sub-float/2addr v3, v0

    iput v3, v1, Lc/f/a/l/q;->g:F

    .line 36
    :goto_6
    invoke-virtual {p0}, Lc/f/a/l/s;->a()V

    .line 37
    iget-object v0, p0, Lc/f/a/l/q;->i:Lc/f/a/l/q;

    invoke-virtual {v0}, Lc/f/a/l/s;->a()V

    goto :goto_7

    .line 38
    :cond_11
    iget v0, p0, Lc/f/a/l/q;->h:I

    const/4 v2, 0x3

    if-ne v0, v2, :cond_13

    iget-object v0, p0, Lc/f/a/l/q;->d:Lc/f/a/l/q;

    if-eqz v0, :cond_13

    iget v0, v0, Lc/f/a/l/s;->b:I

    if-ne v0, v1, :cond_13

    iget-object v0, p0, Lc/f/a/l/q;->i:Lc/f/a/l/q;

    if-eqz v0, :cond_13

    iget-object v0, v0, Lc/f/a/l/q;->d:Lc/f/a/l/q;

    if-eqz v0, :cond_13

    iget v0, v0, Lc/f/a/l/s;->b:I

    if-ne v0, v1, :cond_13

    .line 39
    invoke-static {}, Lc/f/a/f;->j()Lc/f/a/g;

    move-result-object v0

    if-eqz v0, :cond_12

    .line 40
    invoke-static {}, Lc/f/a/f;->j()Lc/f/a/g;

    move-result-object v0

    iget-wide v1, v0, Lc/f/a/g;->w:J

    add-long/2addr v1, v3

    iput-wide v1, v0, Lc/f/a/g;->w:J

    .line 41
    :cond_12
    iget-object v0, p0, Lc/f/a/l/q;->d:Lc/f/a/l/q;

    iget-object v1, v0, Lc/f/a/l/q;->f:Lc/f/a/l/q;

    iput-object v1, p0, Lc/f/a/l/q;->f:Lc/f/a/l/q;

    .line 42
    iget-object v1, p0, Lc/f/a/l/q;->i:Lc/f/a/l/q;

    iget-object v2, v1, Lc/f/a/l/q;->d:Lc/f/a/l/q;

    iget-object v3, v2, Lc/f/a/l/q;->f:Lc/f/a/l/q;

    iput-object v3, v1, Lc/f/a/l/q;->f:Lc/f/a/l/q;

    .line 43
    iget v0, v0, Lc/f/a/l/q;->g:F

    iget v3, p0, Lc/f/a/l/q;->e:F

    add-float/2addr v0, v3

    iput v0, p0, Lc/f/a/l/q;->g:F

    .line 44
    iget v0, v2, Lc/f/a/l/q;->g:F

    iget v2, v1, Lc/f/a/l/q;->e:F

    add-float/2addr v0, v2

    iput v0, v1, Lc/f/a/l/q;->g:F

    .line 45
    invoke-virtual {p0}, Lc/f/a/l/s;->a()V

    .line 46
    iget-object v0, p0, Lc/f/a/l/q;->i:Lc/f/a/l/q;

    invoke-virtual {v0}, Lc/f/a/l/s;->a()V

    goto :goto_7

    .line 47
    :cond_13
    iget v0, p0, Lc/f/a/l/q;->h:I

    const/4 v1, 0x5

    if-ne v0, v1, :cond_14

    .line 48
    iget-object v0, p0, Lc/f/a/l/q;->c:Lc/f/a/l/g;

    iget-object v0, v0, Lc/f/a/l/g;->b:Lc/f/a/l/i;

    invoke-virtual {v0}, Lc/f/a/l/i;->H()V

    :cond_14
    :goto_7
    return-void
.end method

.method public f()F
    .locals 1

    .line 1
    iget v0, p0, Lc/f/a/l/q;->g:F

    return v0
.end method

.method public g()V
    .locals 4

    .line 1
    iget-object v0, p0, Lc/f/a/l/q;->c:Lc/f/a/l/g;

    invoke-virtual {v0}, Lc/f/a/l/g;->g()Lc/f/a/l/g;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {v0}, Lc/f/a/l/g;->g()Lc/f/a/l/g;

    move-result-object v1

    iget-object v2, p0, Lc/f/a/l/q;->c:Lc/f/a/l/g;

    if-ne v1, v2, :cond_1

    const/4 v1, 0x4

    .line 3
    iput v1, p0, Lc/f/a/l/q;->h:I

    .line 4
    invoke-virtual {v0}, Lc/f/a/l/g;->d()Lc/f/a/l/q;

    move-result-object v2

    iput v1, v2, Lc/f/a/l/q;->h:I

    .line 5
    :cond_1
    iget-object v1, p0, Lc/f/a/l/q;->c:Lc/f/a/l/g;

    invoke-virtual {v1}, Lc/f/a/l/g;->b()I

    move-result v1

    .line 6
    iget-object v2, p0, Lc/f/a/l/q;->c:Lc/f/a/l/g;

    iget-object v2, v2, Lc/f/a/l/g;->c:Lc/f/a/l/g$b;

    sget-object v3, Lc/f/a/l/g$b;->e:Lc/f/a/l/g$b;

    if-eq v2, v3, :cond_2

    sget-object v3, Lc/f/a/l/g$b;->f:Lc/f/a/l/g$b;

    if-ne v2, v3, :cond_3

    :cond_2
    neg-int v1, v1

    .line 7
    :cond_3
    invoke-virtual {v0}, Lc/f/a/l/g;->d()Lc/f/a/l/q;

    move-result-object v0

    invoke-virtual {p0, v0, v1}, Lc/f/a/l/q;->a(Lc/f/a/l/q;I)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    iget v0, p0, Lc/f/a/l/s;->b:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 2
    iget-object v0, p0, Lc/f/a/l/q;->f:Lc/f/a/l/q;

    const-string v1, ", RESOLVED: "

    const-string v2, "["

    if-ne v0, p0, :cond_0

    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lc/f/a/l/q;->c:Lc/f/a/l/g;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lc/f/a/l/q;->g:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, "]  type: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lc/f/a/l/q;->h:I

    invoke-virtual {p0, v1}, Lc/f/a/l/q;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 4
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lc/f/a/l/q;->c:Lc/f/a/l/g;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lc/f/a/l/q;->f:Lc/f/a/l/q;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lc/f/a/l/q;->g:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, "] type: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lc/f/a/l/q;->h:I

    .line 5
    invoke-virtual {p0, v1}, Lc/f/a/l/q;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 6
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "{ "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lc/f/a/l/q;->c:Lc/f/a/l/g;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " UNRESOLVED} type: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lc/f/a/l/q;->h:I

    invoke-virtual {p0, v1}, Lc/f/a/l/q;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method