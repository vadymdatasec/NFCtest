.class public final Le/f/a/a/j/j0/k/c;
.super Le/f/a/a/j/j0/k/g;
.source "SourceFile"


# instance fields
.field public final b:J

.field public final c:I

.field public final d:I

.field public final e:J

.field public final f:I


# direct methods
.method public constructor <init>(JIIJI)V
    .locals 0

    .line 2
    invoke-direct {p0}, Le/f/a/a/j/j0/k/g;-><init>()V

    .line 3
    iput-wide p1, p0, Le/f/a/a/j/j0/k/c;->b:J

    .line 4
    iput p3, p0, Le/f/a/a/j/j0/k/c;->c:I

    .line 5
    iput p4, p0, Le/f/a/a/j/j0/k/c;->d:I

    .line 6
    iput-wide p5, p0, Le/f/a/a/j/j0/k/c;->e:J

    .line 7
    iput p7, p0, Le/f/a/a/j/j0/k/c;->f:I

    return-void
.end method

.method public synthetic constructor <init>(JIIJILe/f/a/a/j/j0/k/a;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p7}, Le/f/a/a/j/j0/k/c;-><init>(JIIJI)V

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 1
    iget v0, p0, Le/f/a/a/j/j0/k/c;->d:I

    return v0
.end method

.method public b()J
    .locals 2

    .line 1
    iget-wide v0, p0, Le/f/a/a/j/j0/k/c;->e:J

    return-wide v0
.end method

.method public c()I
    .locals 1

    .line 1
    iget v0, p0, Le/f/a/a/j/j0/k/c;->c:I

    return v0
.end method

.method public d()I
    .locals 1

    .line 1
    iget v0, p0, Le/f/a/a/j/j0/k/c;->f:I

    return v0
.end method

.method public e()J
    .locals 2

    .line 1
    iget-wide v0, p0, Le/f/a/a/j/j0/k/c;->b:J

    return-wide v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 1
    :cond_0
    instance-of v1, p1, Le/f/a/a/j/j0/k/g;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    .line 2
    check-cast p1, Le/f/a/a/j/j0/k/g;

    .line 3
    iget-wide v3, p0, Le/f/a/a/j/j0/k/c;->b:J

    invoke-virtual {p1}, Le/f/a/a/j/j0/k/g;->e()J

    move-result-wide v5

    cmp-long v1, v3, v5

    if-nez v1, :cond_1

    iget v1, p0, Le/f/a/a/j/j0/k/c;->c:I

    .line 4
    invoke-virtual {p1}, Le/f/a/a/j/j0/k/g;->c()I

    move-result v3

    if-ne v1, v3, :cond_1

    iget v1, p0, Le/f/a/a/j/j0/k/c;->d:I

    .line 5
    invoke-virtual {p1}, Le/f/a/a/j/j0/k/g;->a()I

    move-result v3

    if-ne v1, v3, :cond_1

    iget-wide v3, p0, Le/f/a/a/j/j0/k/c;->e:J

    .line 6
    invoke-virtual {p1}, Le/f/a/a/j/j0/k/g;->b()J

    move-result-wide v5

    cmp-long v1, v3, v5

    if-nez v1, :cond_1

    iget v1, p0, Le/f/a/a/j/j0/k/c;->f:I

    .line 7
    invoke-virtual {p1}, Le/f/a/a/j/j0/k/g;->d()I

    move-result p1

    if-ne v1, p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_2
    return v2
.end method

.method public hashCode()I
    .locals 7

    .line 1
    iget-wide v0, p0, Le/f/a/a/j/j0/k/c;->b:J

    const/16 v2, 0x20

    ushr-long v3, v0, v2

    xor-long/2addr v0, v3

    long-to-int v1, v0

    const v0, 0xf4243

    xor-int/2addr v1, v0

    mul-int v1, v1, v0

    .line 2
    iget v3, p0, Le/f/a/a/j/j0/k/c;->c:I

    xor-int/2addr v1, v3

    mul-int v1, v1, v0

    .line 3
    iget v3, p0, Le/f/a/a/j/j0/k/c;->d:I

    xor-int/2addr v1, v3

    mul-int v1, v1, v0

    .line 4
    iget-wide v3, p0, Le/f/a/a/j/j0/k/c;->e:J

    ushr-long v5, v3, v2

    xor-long v2, v5, v3

    long-to-int v3, v2

    xor-int/2addr v1, v3

    mul-int v1, v1, v0

    .line 5
    iget v0, p0, Le/f/a/a/j/j0/k/c;->f:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "EventStoreConfig{maxStorageSizeInBytes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Le/f/a/a/j/j0/k/c;->b:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", loadBatchSize="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Le/f/a/a/j/j0/k/c;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", criticalSectionEnterTimeoutMs="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Le/f/a/a/j/j0/k/c;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", eventCleanUpAge="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Le/f/a/a/j/j0/k/c;->e:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", maxBlobByteSizePerRow="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Le/f/a/a/j/j0/k/c;->f:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method