.class public final Le/f/c/l/e/o/x;
.super Le/f/c/l/e/o/o3;
.source "SourceFile"


# instance fields
.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:I

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;

.field public final g:Ljava/lang/String;

.field public final h:Le/f/c/l/e/o/m3;

.field public final i:Le/f/c/l/e/o/h2;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Le/f/c/l/e/o/m3;Le/f/c/l/e/o/h2;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Le/f/c/l/e/o/o3;-><init>()V

    .line 3
    iput-object p1, p0, Le/f/c/l/e/o/x;->b:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Le/f/c/l/e/o/x;->c:Ljava/lang/String;

    .line 5
    iput p3, p0, Le/f/c/l/e/o/x;->d:I

    .line 6
    iput-object p4, p0, Le/f/c/l/e/o/x;->e:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Le/f/c/l/e/o/x;->f:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Le/f/c/l/e/o/x;->g:Ljava/lang/String;

    .line 9
    iput-object p7, p0, Le/f/c/l/e/o/x;->h:Le/f/c/l/e/o/m3;

    .line 10
    iput-object p8, p0, Le/f/c/l/e/o/x;->i:Le/f/c/l/e/o/h2;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Le/f/c/l/e/o/m3;Le/f/c/l/e/o/h2;Le/f/c/l/e/o/v;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p8}, Le/f/c/l/e/o/x;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Le/f/c/l/e/o/m3;Le/f/c/l/e/o/h2;)V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/c/l/e/o/x;->f:Ljava/lang/String;

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/c/l/e/o/x;->g:Ljava/lang/String;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/c/l/e/o/x;->c:Ljava/lang/String;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/c/l/e/o/x;->e:Ljava/lang/String;

    return-object v0
.end method

.method public e()Le/f/c/l/e/o/h2;
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/c/l/e/o/x;->i:Le/f/c/l/e/o/h2;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 1
    :cond_0
    instance-of v1, p1, Le/f/c/l/e/o/o3;

    const/4 v2, 0x0

    if-eqz v1, :cond_4

    .line 2
    check-cast p1, Le/f/c/l/e/o/o3;

    .line 3
    iget-object v1, p0, Le/f/c/l/e/o/x;->b:Ljava/lang/String;

    invoke-virtual {p1}, Le/f/c/l/e/o/o3;->g()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Le/f/c/l/e/o/x;->c:Ljava/lang/String;

    .line 4
    invoke-virtual {p1}, Le/f/c/l/e/o/o3;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget v1, p0, Le/f/c/l/e/o/x;->d:I

    .line 5
    invoke-virtual {p1}, Le/f/c/l/e/o/o3;->f()I

    move-result v3

    if-ne v1, v3, :cond_3

    iget-object v1, p0, Le/f/c/l/e/o/x;->e:Ljava/lang/String;

    .line 6
    invoke-virtual {p1}, Le/f/c/l/e/o/o3;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Le/f/c/l/e/o/x;->f:Ljava/lang/String;

    .line 7
    invoke-virtual {p1}, Le/f/c/l/e/o/o3;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Le/f/c/l/e/o/x;->g:Ljava/lang/String;

    .line 8
    invoke-virtual {p1}, Le/f/c/l/e/o/o3;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Le/f/c/l/e/o/x;->h:Le/f/c/l/e/o/m3;

    if-nez v1, :cond_1

    .line 9
    invoke-virtual {p1}, Le/f/c/l/e/o/o3;->h()Le/f/c/l/e/o/m3;

    move-result-object v1

    if-nez v1, :cond_3

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Le/f/c/l/e/o/o3;->h()Le/f/c/l/e/o/m3;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    :goto_0
    iget-object v1, p0, Le/f/c/l/e/o/x;->i:Le/f/c/l/e/o/h2;

    if-nez v1, :cond_2

    .line 10
    invoke-virtual {p1}, Le/f/c/l/e/o/o3;->e()Le/f/c/l/e/o/h2;

    move-result-object p1

    if-nez p1, :cond_3

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Le/f/c/l/e/o/o3;->e()Le/f/c/l/e/o/h2;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    :goto_1
    return v0

    :cond_4
    return v2
.end method

.method public f()I
    .locals 1

    .line 1
    iget v0, p0, Le/f/c/l/e/o/x;->d:I

    return v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/c/l/e/o/x;->b:Ljava/lang/String;

    return-object v0
.end method

.method public h()Le/f/c/l/e/o/m3;
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/c/l/e/o/x;->h:Le/f/c/l/e/o/m3;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, Le/f/c/l/e/o/x;->b:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int v0, v0, v1

    .line 2
    iget-object v2, p0, Le/f/c/l/e/o/x;->c:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 3
    iget v2, p0, Le/f/c/l/e/o/x;->d:I

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 4
    iget-object v2, p0, Le/f/c/l/e/o/x;->e:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 5
    iget-object v2, p0, Le/f/c/l/e/o/x;->f:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 6
    iget-object v2, p0, Le/f/c/l/e/o/x;->g:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 7
    iget-object v2, p0, Le/f/c/l/e/o/x;->h:Le/f/c/l/e/o/m3;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 8
    iget-object v1, p0, Le/f/c/l/e/o/x;->i:Le/f/c/l/e/o/h2;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_1
    xor-int/2addr v0, v3

    return v0
.end method

.method public j()Le/f/c/l/e/o/b2;
    .locals 2

    .line 1
    new-instance v0, Le/f/c/l/e/o/w;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Le/f/c/l/e/o/w;-><init>(Le/f/c/l/e/o/o3;Le/f/c/l/e/o/v;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CrashlyticsReport{sdkVersion="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/f/c/l/e/o/x;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", gmpAppId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/f/c/l/e/o/x;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", platform="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Le/f/c/l/e/o/x;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", installationUuid="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/f/c/l/e/o/x;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", buildVersion="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/f/c/l/e/o/x;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", displayVersion="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/f/c/l/e/o/x;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", session="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/f/c/l/e/o/x;->h:Le/f/c/l/e/o/m3;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", ndkPayload="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/f/c/l/e/o/x;->i:Le/f/c/l/e/o/h2;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
