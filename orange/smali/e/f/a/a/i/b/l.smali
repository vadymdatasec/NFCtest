.class public final Le/f/a/a/i/b/l;
.super Le/f/a/a/i/b/b;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/Integer;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;

.field public final g:Ljava/lang/String;

.field public final h:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Le/f/a/a/i/b/j;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Le/f/a/a/i/b/b;-><init>()V

    .line 2
    iput-object p1, p0, Le/f/a/a/i/b/l;->a:Ljava/lang/Integer;

    .line 3
    iput-object p2, p0, Le/f/a/a/i/b/l;->b:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Le/f/a/a/i/b/l;->c:Ljava/lang/String;

    .line 5
    iput-object p4, p0, Le/f/a/a/i/b/l;->d:Ljava/lang/String;

    .line 6
    iput-object p5, p0, Le/f/a/a/i/b/l;->e:Ljava/lang/String;

    .line 7
    iput-object p6, p0, Le/f/a/a/i/b/l;->f:Ljava/lang/String;

    .line 8
    iput-object p7, p0, Le/f/a/a/i/b/l;->g:Ljava/lang/String;

    .line 9
    iput-object p8, p0, Le/f/a/a/i/b/l;->h:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/a/a/i/b/l;->d:Ljava/lang/String;

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/a/a/i/b/l;->h:Ljava/lang/String;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/a/a/i/b/l;->c:Ljava/lang/String;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/a/a/i/b/l;->g:Ljava/lang/String;

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/a/a/i/b/l;->b:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 1
    :cond_0
    instance-of v1, p1, Le/f/a/a/i/b/b;

    const/4 v2, 0x0

    if-eqz v1, :cond_a

    .line 2
    iget-object v1, p0, Le/f/a/a/i/b/l;->a:Ljava/lang/Integer;

    if-nez v1, :cond_1

    move-object v1, p1

    check-cast v1, Le/f/a/a/i/b/l;

    .line 3
    iget-object v1, v1, Le/f/a/a/i/b/l;->a:Ljava/lang/Integer;

    if-nez v1, :cond_9

    goto :goto_0

    .line 4
    :cond_1
    move-object v3, p1

    check-cast v3, Le/f/a/a/i/b/l;

    .line 5
    iget-object v3, v3, Le/f/a/a/i/b/l;->a:Ljava/lang/Integer;

    .line 6
    invoke-virtual {v1, v3}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9

    :goto_0
    iget-object v1, p0, Le/f/a/a/i/b/l;->b:Ljava/lang/String;

    if-nez v1, :cond_2

    .line 7
    move-object v1, p1

    check-cast v1, Le/f/a/a/i/b/l;

    .line 8
    iget-object v1, v1, Le/f/a/a/i/b/l;->b:Ljava/lang/String;

    if-nez v1, :cond_9

    goto :goto_1

    .line 9
    :cond_2
    move-object v3, p1

    check-cast v3, Le/f/a/a/i/b/l;

    .line 10
    iget-object v3, v3, Le/f/a/a/i/b/l;->b:Ljava/lang/String;

    .line 11
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9

    :goto_1
    iget-object v1, p0, Le/f/a/a/i/b/l;->c:Ljava/lang/String;

    if-nez v1, :cond_3

    .line 12
    move-object v1, p1

    check-cast v1, Le/f/a/a/i/b/l;

    .line 13
    iget-object v1, v1, Le/f/a/a/i/b/l;->c:Ljava/lang/String;

    if-nez v1, :cond_9

    goto :goto_2

    .line 14
    :cond_3
    move-object v3, p1

    check-cast v3, Le/f/a/a/i/b/l;

    .line 15
    iget-object v3, v3, Le/f/a/a/i/b/l;->c:Ljava/lang/String;

    .line 16
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9

    :goto_2
    iget-object v1, p0, Le/f/a/a/i/b/l;->d:Ljava/lang/String;

    if-nez v1, :cond_4

    .line 17
    move-object v1, p1

    check-cast v1, Le/f/a/a/i/b/l;

    .line 18
    iget-object v1, v1, Le/f/a/a/i/b/l;->d:Ljava/lang/String;

    if-nez v1, :cond_9

    goto :goto_3

    .line 19
    :cond_4
    move-object v3, p1

    check-cast v3, Le/f/a/a/i/b/l;

    .line 20
    iget-object v3, v3, Le/f/a/a/i/b/l;->d:Ljava/lang/String;

    .line 21
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9

    :goto_3
    iget-object v1, p0, Le/f/a/a/i/b/l;->e:Ljava/lang/String;

    if-nez v1, :cond_5

    .line 22
    move-object v1, p1

    check-cast v1, Le/f/a/a/i/b/l;

    .line 23
    iget-object v1, v1, Le/f/a/a/i/b/l;->e:Ljava/lang/String;

    if-nez v1, :cond_9

    goto :goto_4

    .line 24
    :cond_5
    move-object v3, p1

    check-cast v3, Le/f/a/a/i/b/l;

    .line 25
    iget-object v3, v3, Le/f/a/a/i/b/l;->e:Ljava/lang/String;

    .line 26
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9

    :goto_4
    iget-object v1, p0, Le/f/a/a/i/b/l;->f:Ljava/lang/String;

    if-nez v1, :cond_6

    .line 27
    move-object v1, p1

    check-cast v1, Le/f/a/a/i/b/l;

    .line 28
    iget-object v1, v1, Le/f/a/a/i/b/l;->f:Ljava/lang/String;

    if-nez v1, :cond_9

    goto :goto_5

    .line 29
    :cond_6
    move-object v3, p1

    check-cast v3, Le/f/a/a/i/b/l;

    .line 30
    iget-object v3, v3, Le/f/a/a/i/b/l;->f:Ljava/lang/String;

    .line 31
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9

    :goto_5
    iget-object v1, p0, Le/f/a/a/i/b/l;->g:Ljava/lang/String;

    if-nez v1, :cond_7

    .line 32
    move-object v1, p1

    check-cast v1, Le/f/a/a/i/b/l;

    .line 33
    iget-object v1, v1, Le/f/a/a/i/b/l;->g:Ljava/lang/String;

    if-nez v1, :cond_9

    goto :goto_6

    .line 34
    :cond_7
    move-object v3, p1

    check-cast v3, Le/f/a/a/i/b/l;

    .line 35
    iget-object v3, v3, Le/f/a/a/i/b/l;->g:Ljava/lang/String;

    .line 36
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9

    :goto_6
    iget-object v1, p0, Le/f/a/a/i/b/l;->h:Ljava/lang/String;

    if-nez v1, :cond_8

    .line 37
    check-cast p1, Le/f/a/a/i/b/l;

    .line 38
    iget-object p1, p1, Le/f/a/a/i/b/l;->h:Ljava/lang/String;

    if-nez p1, :cond_9

    goto :goto_7

    .line 39
    :cond_8
    check-cast p1, Le/f/a/a/i/b/l;

    .line 40
    iget-object p1, p1, Le/f/a/a/i/b/l;->h:Ljava/lang/String;

    .line 41
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_9

    goto :goto_7

    :cond_9
    const/4 v0, 0x0

    :goto_7
    return v0

    :cond_a
    return v2
.end method

.method public f()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/a/a/i/b/l;->f:Ljava/lang/String;

    return-object v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/a/a/i/b/l;->e:Ljava/lang/String;

    return-object v0
.end method

.method public h()Ljava/lang/Integer;
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/a/a/i/b/l;->a:Ljava/lang/Integer;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, Le/f/a/a/i/b/l;->a:Ljava/lang/Integer;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->hashCode()I

    move-result v0

    :goto_0
    const v2, 0xf4243

    xor-int/2addr v0, v2

    mul-int v0, v0, v2

    .line 2
    iget-object v3, p0, Le/f/a/a/i/b/l;->b:Ljava/lang/String;

    if-nez v3, :cond_1

    const/4 v3, 0x0

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_1
    xor-int/2addr v0, v3

    mul-int v0, v0, v2

    .line 3
    iget-object v3, p0, Le/f/a/a/i/b/l;->c:Ljava/lang/String;

    if-nez v3, :cond_2

    const/4 v3, 0x0

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_2
    xor-int/2addr v0, v3

    mul-int v0, v0, v2

    .line 4
    iget-object v3, p0, Le/f/a/a/i/b/l;->d:Ljava/lang/String;

    if-nez v3, :cond_3

    const/4 v3, 0x0

    goto :goto_3

    :cond_3
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_3
    xor-int/2addr v0, v3

    mul-int v0, v0, v2

    .line 5
    iget-object v3, p0, Le/f/a/a/i/b/l;->e:Ljava/lang/String;

    if-nez v3, :cond_4

    const/4 v3, 0x0

    goto :goto_4

    :cond_4
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_4
    xor-int/2addr v0, v3

    mul-int v0, v0, v2

    .line 6
    iget-object v3, p0, Le/f/a/a/i/b/l;->f:Ljava/lang/String;

    if-nez v3, :cond_5

    const/4 v3, 0x0

    goto :goto_5

    :cond_5
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_5
    xor-int/2addr v0, v3

    mul-int v0, v0, v2

    .line 7
    iget-object v3, p0, Le/f/a/a/i/b/l;->g:Ljava/lang/String;

    if-nez v3, :cond_6

    const/4 v3, 0x0

    goto :goto_6

    :cond_6
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_6
    xor-int/2addr v0, v3

    mul-int v0, v0, v2

    .line 8
    iget-object v2, p0, Le/f/a/a/i/b/l;->h:Ljava/lang/String;

    if-nez v2, :cond_7

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_7
    xor-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AndroidClientInfo{sdkVersion="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/f/a/a/i/b/l;->a:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", model="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/f/a/a/i/b/l;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", hardware="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/f/a/a/i/b/l;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", device="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/f/a/a/i/b/l;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", product="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/f/a/a/i/b/l;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", osBuild="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/f/a/a/i/b/l;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", manufacturer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/f/a/a/i/b/l;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", fingerprint="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/f/a/a/i/b/l;->h:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
