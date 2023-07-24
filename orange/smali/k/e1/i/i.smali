.class public final Lk/e1/i/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk/g0;


# instance fields
.field public final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lk/h0;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lk/e1/h/h;

.field public final c:Lk/e1/i/d;

.field public final d:Lk/e1/h/c;

.field public final e:I

.field public final f:Lk/u0;

.field public final g:Lk/g;

.field public final h:Lk/a0;

.field public final i:I

.field public final j:I

.field public final k:I

.field public l:I


# direct methods
.method public constructor <init>(Ljava/util/List;Lk/e1/h/h;Lk/e1/i/d;Lk/e1/h/c;ILk/u0;Lk/g;Lk/a0;III)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lk/h0;",
            ">;",
            "Lk/e1/h/h;",
            "Lk/e1/i/d;",
            "Lk/e1/h/c;",
            "I",
            "Lk/u0;",
            "Lk/g;",
            "Lk/a0;",
            "III)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lk/e1/i/i;->a:Ljava/util/List;

    .line 3
    iput-object p4, p0, Lk/e1/i/i;->d:Lk/e1/h/c;

    .line 4
    iput-object p2, p0, Lk/e1/i/i;->b:Lk/e1/h/h;

    .line 5
    iput-object p3, p0, Lk/e1/i/i;->c:Lk/e1/i/d;

    .line 6
    iput p5, p0, Lk/e1/i/i;->e:I

    .line 7
    iput-object p6, p0, Lk/e1/i/i;->f:Lk/u0;

    .line 8
    iput-object p7, p0, Lk/e1/i/i;->g:Lk/g;

    .line 9
    iput-object p8, p0, Lk/e1/i/i;->h:Lk/a0;

    .line 10
    iput p9, p0, Lk/e1/i/i;->i:I

    .line 11
    iput p10, p0, Lk/e1/i/i;->j:I

    .line 12
    iput p11, p0, Lk/e1/i/i;->k:I

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 1
    iget v0, p0, Lk/e1/i/i;->k:I

    return v0
.end method

.method public a(Lk/u0;)Lk/z0;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lk/e1/i/i;->b:Lk/e1/h/h;

    iget-object v1, p0, Lk/e1/i/i;->c:Lk/e1/i/d;

    iget-object v2, p0, Lk/e1/i/i;->d:Lk/e1/h/c;

    invoke-virtual {p0, p1, v0, v1, v2}, Lk/e1/i/i;->a(Lk/u0;Lk/e1/h/h;Lk/e1/i/d;Lk/e1/h/c;)Lk/z0;

    move-result-object p1

    return-object p1
.end method

.method public a(Lk/u0;Lk/e1/h/h;Lk/e1/i/d;Lk/e1/h/c;)Lk/z0;
    .locals 17
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    move-object/from16 v0, p0

    .line 3
    iget v1, v0, Lk/e1/i/i;->e:I

    iget-object v2, v0, Lk/e1/i/i;->a:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_8

    .line 4
    iget v1, v0, Lk/e1/i/i;->l:I

    const/4 v2, 0x1

    add-int/2addr v1, v2

    iput v1, v0, Lk/e1/i/i;->l:I

    .line 5
    iget-object v1, v0, Lk/e1/i/i;->c:Lk/e1/i/d;

    const-string v3, "network interceptor "

    if-eqz v1, :cond_1

    iget-object v1, v0, Lk/e1/i/i;->d:Lk/e1/h/c;

    invoke-virtual/range {p1 .. p1}, Lk/u0;->g()Lk/f0;

    move-result-object v4

    invoke-virtual {v1, v4}, Lk/e1/h/c;->a(Lk/f0;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 6
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v0, Lk/e1/i/i;->a:Ljava/util/List;

    iget v5, v0, Lk/e1/i/i;->e:I

    sub-int/2addr v5, v2

    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " must retain the same host and port"

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 7
    :cond_1
    :goto_0
    iget-object v1, v0, Lk/e1/i/i;->c:Lk/e1/i/d;

    const-string v4, " must call proceed() exactly once"

    if-eqz v1, :cond_3

    iget v1, v0, Lk/e1/i/i;->l:I

    if-gt v1, v2, :cond_2

    goto :goto_1

    .line 8
    :cond_2
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v0, Lk/e1/i/i;->a:Ljava/util/List;

    iget v6, v0, Lk/e1/i/i;->e:I

    sub-int/2addr v6, v2

    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 9
    :cond_3
    :goto_1
    new-instance v1, Lk/e1/i/i;

    iget-object v6, v0, Lk/e1/i/i;->a:Ljava/util/List;

    iget v5, v0, Lk/e1/i/i;->e:I

    add-int/lit8 v10, v5, 0x1

    iget-object v12, v0, Lk/e1/i/i;->g:Lk/g;

    iget-object v13, v0, Lk/e1/i/i;->h:Lk/a0;

    iget v14, v0, Lk/e1/i/i;->i:I

    iget v15, v0, Lk/e1/i/i;->j:I

    iget v11, v0, Lk/e1/i/i;->k:I

    move-object v5, v1

    move-object/from16 v7, p2

    move-object/from16 v8, p3

    move-object/from16 v9, p4

    move/from16 v16, v11

    move-object/from16 v11, p1

    invoke-direct/range {v5 .. v16}, Lk/e1/i/i;-><init>(Ljava/util/List;Lk/e1/h/h;Lk/e1/i/d;Lk/e1/h/c;ILk/u0;Lk/g;Lk/a0;III)V

    .line 10
    iget-object v5, v0, Lk/e1/i/i;->a:Ljava/util/List;

    iget v6, v0, Lk/e1/i/i;->e:I

    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lk/h0;

    .line 11
    invoke-interface {v5, v1}, Lk/h0;->a(Lk/g0;)Lk/z0;

    move-result-object v6

    if-eqz p3, :cond_5

    .line 12
    iget v7, v0, Lk/e1/i/i;->e:I

    add-int/2addr v7, v2

    iget-object v8, v0, Lk/e1/i/i;->a:Ljava/util/List;

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v8

    if-ge v7, v8, :cond_5

    iget v1, v1, Lk/e1/i/i;->l:I

    if-ne v1, v2, :cond_4

    goto :goto_2

    .line 13
    :cond_4
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_5
    :goto_2
    const-string v1, "interceptor "

    if-eqz v6, :cond_7

    .line 14
    invoke-virtual {v6}, Lk/z0;->c()Lk/b1;

    move-result-object v2

    if-eqz v2, :cond_6

    return-object v6

    .line 15
    :cond_6
    new-instance v2, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " returned a response with no body"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 16
    :cond_7
    new-instance v2, Ljava/lang/NullPointerException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " returned null"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 17
    :cond_8
    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1}, Ljava/lang/AssertionError;-><init>()V

    throw v1
.end method

.method public b()Lk/u0;
    .locals 1

    .line 1
    iget-object v0, p0, Lk/e1/i/i;->f:Lk/u0;

    return-object v0
.end method

.method public c()I
    .locals 1

    .line 1
    iget v0, p0, Lk/e1/i/i;->i:I

    return v0
.end method

.method public d()I
    .locals 1

    .line 1
    iget v0, p0, Lk/e1/i/i;->j:I

    return v0
.end method

.method public e()Lk/g;
    .locals 1

    .line 1
    iget-object v0, p0, Lk/e1/i/i;->g:Lk/g;

    return-object v0
.end method

.method public f()Lk/m;
    .locals 1

    .line 1
    iget-object v0, p0, Lk/e1/i/i;->d:Lk/e1/h/c;

    return-object v0
.end method

.method public g()Lk/a0;
    .locals 1

    .line 1
    iget-object v0, p0, Lk/e1/i/i;->h:Lk/a0;

    return-object v0
.end method

.method public h()Lk/e1/i/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lk/e1/i/i;->c:Lk/e1/i/d;

    return-object v0
.end method

.method public i()Lk/e1/h/h;
    .locals 1

    .line 1
    iget-object v0, p0, Lk/e1/i/i;->b:Lk/e1/h/h;

    return-object v0
.end method
