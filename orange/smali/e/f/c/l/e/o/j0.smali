.class public final Le/f/c/l/e/o/j0;
.super Le/f/c/l/e/o/m3;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:J

.field public final d:Ljava/lang/Long;

.field public final e:Z

.field public final f:Le/f/c/l/e/o/k2;

.field public final g:Le/f/c/l/e/o/l3;

.field public final h:Le/f/c/l/e/o/j3;

.field public final i:Le/f/c/l/e/o/n2;

.field public final j:Le/f/c/l/e/o/p3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/c/l/e/o/p3<",
            "Le/f/c/l/e/o/h3;",
            ">;"
        }
    .end annotation
.end field

.field public final k:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Long;ZLe/f/c/l/e/o/k2;Le/f/c/l/e/o/l3;Le/f/c/l/e/o/j3;Le/f/c/l/e/o/n2;Le/f/c/l/e/o/p3;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "J",
            "Ljava/lang/Long;",
            "Z",
            "Le/f/c/l/e/o/k2;",
            "Le/f/c/l/e/o/l3;",
            "Le/f/c/l/e/o/j3;",
            "Le/f/c/l/e/o/n2;",
            "Le/f/c/l/e/o/p3<",
            "Le/f/c/l/e/o/h3;",
            ">;I)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Le/f/c/l/e/o/m3;-><init>()V

    .line 3
    iput-object p1, p0, Le/f/c/l/e/o/j0;->a:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Le/f/c/l/e/o/j0;->b:Ljava/lang/String;

    .line 5
    iput-wide p3, p0, Le/f/c/l/e/o/j0;->c:J

    .line 6
    iput-object p5, p0, Le/f/c/l/e/o/j0;->d:Ljava/lang/Long;

    .line 7
    iput-boolean p6, p0, Le/f/c/l/e/o/j0;->e:Z

    .line 8
    iput-object p7, p0, Le/f/c/l/e/o/j0;->f:Le/f/c/l/e/o/k2;

    .line 9
    iput-object p8, p0, Le/f/c/l/e/o/j0;->g:Le/f/c/l/e/o/l3;

    .line 10
    iput-object p9, p0, Le/f/c/l/e/o/j0;->h:Le/f/c/l/e/o/j3;

    .line 11
    iput-object p10, p0, Le/f/c/l/e/o/j0;->i:Le/f/c/l/e/o/n2;

    .line 12
    iput-object p11, p0, Le/f/c/l/e/o/j0;->j:Le/f/c/l/e/o/p3;

    .line 13
    iput p12, p0, Le/f/c/l/e/o/j0;->k:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Long;ZLe/f/c/l/e/o/k2;Le/f/c/l/e/o/l3;Le/f/c/l/e/o/j3;Le/f/c/l/e/o/n2;Le/f/c/l/e/o/p3;ILe/f/c/l/e/o/h0;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p12}, Le/f/c/l/e/o/j0;-><init>(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Long;ZLe/f/c/l/e/o/k2;Le/f/c/l/e/o/l3;Le/f/c/l/e/o/j3;Le/f/c/l/e/o/n2;Le/f/c/l/e/o/p3;I)V

    return-void
.end method


# virtual methods
.method public a()Le/f/c/l/e/o/k2;
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/c/l/e/o/j0;->f:Le/f/c/l/e/o/k2;

    return-object v0
.end method

.method public b()Le/f/c/l/e/o/n2;
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/c/l/e/o/j0;->i:Le/f/c/l/e/o/n2;

    return-object v0
.end method

.method public c()Ljava/lang/Long;
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/c/l/e/o/j0;->d:Ljava/lang/Long;

    return-object v0
.end method

.method public d()Le/f/c/l/e/o/p3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Le/f/c/l/e/o/p3<",
            "Le/f/c/l/e/o/h3;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/f/c/l/e/o/j0;->j:Le/f/c/l/e/o/p3;

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/c/l/e/o/j0;->a:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 1
    :cond_0
    instance-of v1, p1, Le/f/c/l/e/o/m3;

    const/4 v2, 0x0

    if-eqz v1, :cond_7

    .line 2
    check-cast p1, Le/f/c/l/e/o/m3;

    .line 3
    iget-object v1, p0, Le/f/c/l/e/o/j0;->a:Ljava/lang/String;

    invoke-virtual {p1}, Le/f/c/l/e/o/m3;->e()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    iget-object v1, p0, Le/f/c/l/e/o/j0;->b:Ljava/lang/String;

    .line 4
    invoke-virtual {p1}, Le/f/c/l/e/o/m3;->g()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    iget-wide v3, p0, Le/f/c/l/e/o/j0;->c:J

    .line 5
    invoke-virtual {p1}, Le/f/c/l/e/o/m3;->j()J

    move-result-wide v5

    cmp-long v1, v3, v5

    if-nez v1, :cond_6

    iget-object v1, p0, Le/f/c/l/e/o/j0;->d:Ljava/lang/Long;

    if-nez v1, :cond_1

    .line 6
    invoke-virtual {p1}, Le/f/c/l/e/o/m3;->c()Ljava/lang/Long;

    move-result-object v1

    if-nez v1, :cond_6

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Le/f/c/l/e/o/m3;->c()Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Long;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    :goto_0
    iget-boolean v1, p0, Le/f/c/l/e/o/j0;->e:Z

    .line 7
    invoke-virtual {p1}, Le/f/c/l/e/o/m3;->l()Z

    move-result v3

    if-ne v1, v3, :cond_6

    iget-object v1, p0, Le/f/c/l/e/o/j0;->f:Le/f/c/l/e/o/k2;

    .line 8
    invoke-virtual {p1}, Le/f/c/l/e/o/m3;->a()Le/f/c/l/e/o/k2;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    iget-object v1, p0, Le/f/c/l/e/o/j0;->g:Le/f/c/l/e/o/l3;

    if-nez v1, :cond_2

    .line 9
    invoke-virtual {p1}, Le/f/c/l/e/o/m3;->k()Le/f/c/l/e/o/l3;

    move-result-object v1

    if-nez v1, :cond_6

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Le/f/c/l/e/o/m3;->k()Le/f/c/l/e/o/l3;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    :goto_1
    iget-object v1, p0, Le/f/c/l/e/o/j0;->h:Le/f/c/l/e/o/j3;

    if-nez v1, :cond_3

    .line 10
    invoke-virtual {p1}, Le/f/c/l/e/o/m3;->i()Le/f/c/l/e/o/j3;

    move-result-object v1

    if-nez v1, :cond_6

    goto :goto_2

    :cond_3
    invoke-virtual {p1}, Le/f/c/l/e/o/m3;->i()Le/f/c/l/e/o/j3;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    :goto_2
    iget-object v1, p0, Le/f/c/l/e/o/j0;->i:Le/f/c/l/e/o/n2;

    if-nez v1, :cond_4

    .line 11
    invoke-virtual {p1}, Le/f/c/l/e/o/m3;->b()Le/f/c/l/e/o/n2;

    move-result-object v1

    if-nez v1, :cond_6

    goto :goto_3

    :cond_4
    invoke-virtual {p1}, Le/f/c/l/e/o/m3;->b()Le/f/c/l/e/o/n2;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    :goto_3
    iget-object v1, p0, Le/f/c/l/e/o/j0;->j:Le/f/c/l/e/o/p3;

    if-nez v1, :cond_5

    .line 12
    invoke-virtual {p1}, Le/f/c/l/e/o/m3;->d()Le/f/c/l/e/o/p3;

    move-result-object v1

    if-nez v1, :cond_6

    goto :goto_4

    :cond_5
    invoke-virtual {p1}, Le/f/c/l/e/o/m3;->d()Le/f/c/l/e/o/p3;

    move-result-object v3

    invoke-virtual {v1, v3}, Le/f/c/l/e/o/p3;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    :goto_4
    iget v1, p0, Le/f/c/l/e/o/j0;->k:I

    .line 13
    invoke-virtual {p1}, Le/f/c/l/e/o/m3;->f()I

    move-result p1

    if-ne v1, p1, :cond_6

    goto :goto_5

    :cond_6
    const/4 v0, 0x0

    :goto_5
    return v0

    :cond_7
    return v2
.end method

.method public f()I
    .locals 1

    .line 1
    iget v0, p0, Le/f/c/l/e/o/j0;->k:I

    return v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/c/l/e/o/j0;->b:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 6

    .line 1
    iget-object v0, p0, Le/f/c/l/e/o/j0;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int v0, v0, v1

    .line 2
    iget-object v2, p0, Le/f/c/l/e/o/j0;->b:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 3
    iget-wide v2, p0, Le/f/c/l/e/o/j0;->c:J

    const/16 v4, 0x20

    ushr-long v4, v2, v4

    xor-long/2addr v2, v4

    long-to-int v3, v2

    xor-int/2addr v0, v3

    mul-int v0, v0, v1

    .line 4
    iget-object v2, p0, Le/f/c/l/e/o/j0;->d:Ljava/lang/Long;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Long;->hashCode()I

    move-result v2

    :goto_0
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 5
    iget-boolean v2, p0, Le/f/c/l/e/o/j0;->e:Z

    if-eqz v2, :cond_1

    const/16 v2, 0x4cf

    goto :goto_1

    :cond_1
    const/16 v2, 0x4d5

    :goto_1
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 6
    iget-object v2, p0, Le/f/c/l/e/o/j0;->f:Le/f/c/l/e/o/k2;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 7
    iget-object v2, p0, Le/f/c/l/e/o/j0;->g:Le/f/c/l/e/o/l3;

    if-nez v2, :cond_2

    const/4 v2, 0x0

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 8
    iget-object v2, p0, Le/f/c/l/e/o/j0;->h:Le/f/c/l/e/o/j3;

    if-nez v2, :cond_3

    const/4 v2, 0x0

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_3
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 9
    iget-object v2, p0, Le/f/c/l/e/o/j0;->i:Le/f/c/l/e/o/n2;

    if-nez v2, :cond_4

    const/4 v2, 0x0

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_4
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 10
    iget-object v2, p0, Le/f/c/l/e/o/j0;->j:Le/f/c/l/e/o/p3;

    if-nez v2, :cond_5

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Le/f/c/l/e/o/p3;->hashCode()I

    move-result v3

    :goto_5
    xor-int/2addr v0, v3

    mul-int v0, v0, v1

    .line 11
    iget v1, p0, Le/f/c/l/e/o/j0;->k:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public i()Le/f/c/l/e/o/j3;
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/c/l/e/o/j0;->h:Le/f/c/l/e/o/j3;

    return-object v0
.end method

.method public j()J
    .locals 2

    .line 1
    iget-wide v0, p0, Le/f/c/l/e/o/j0;->c:J

    return-wide v0
.end method

.method public k()Le/f/c/l/e/o/l3;
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/c/l/e/o/j0;->g:Le/f/c/l/e/o/l3;

    return-object v0
.end method

.method public l()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Le/f/c/l/e/o/j0;->e:Z

    return v0
.end method

.method public m()Le/f/c/l/e/o/l2;
    .locals 2

    .line 1
    new-instance v0, Le/f/c/l/e/o/i0;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Le/f/c/l/e/o/i0;-><init>(Le/f/c/l/e/o/m3;Le/f/c/l/e/o/h0;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Session{generator="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/f/c/l/e/o/j0;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", identifier="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/f/c/l/e/o/j0;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", startedAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Le/f/c/l/e/o/j0;->c:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", endedAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/f/c/l/e/o/j0;->d:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", crashed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Le/f/c/l/e/o/j0;->e:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", app="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/f/c/l/e/o/j0;->f:Le/f/c/l/e/o/k2;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", user="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/f/c/l/e/o/j0;->g:Le/f/c/l/e/o/l3;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", os="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/f/c/l/e/o/j0;->h:Le/f/c/l/e/o/j3;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", device="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/f/c/l/e/o/j0;->i:Le/f/c/l/e/o/n2;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", events="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/f/c/l/e/o/j0;->j:Le/f/c/l/e/o/p3;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", generatorType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Le/f/c/l/e/o/j0;->k:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
