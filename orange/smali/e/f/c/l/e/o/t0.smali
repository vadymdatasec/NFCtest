.class public final Le/f/c/l/e/o/t0;
.super Le/f/c/l/e/o/h3;
.source "SourceFile"


# instance fields
.field public final a:J

.field public final b:Ljava/lang/String;

.field public final c:Le/f/c/l/e/o/b3;

.field public final d:Le/f/c/l/e/o/e3;

.field public final e:Le/f/c/l/e/o/g3;


# direct methods
.method public constructor <init>(JLjava/lang/String;Le/f/c/l/e/o/b3;Le/f/c/l/e/o/e3;Le/f/c/l/e/o/g3;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Le/f/c/l/e/o/h3;-><init>()V

    .line 3
    iput-wide p1, p0, Le/f/c/l/e/o/t0;->a:J

    .line 4
    iput-object p3, p0, Le/f/c/l/e/o/t0;->b:Ljava/lang/String;

    .line 5
    iput-object p4, p0, Le/f/c/l/e/o/t0;->c:Le/f/c/l/e/o/b3;

    .line 6
    iput-object p5, p0, Le/f/c/l/e/o/t0;->d:Le/f/c/l/e/o/e3;

    .line 7
    iput-object p6, p0, Le/f/c/l/e/o/t0;->e:Le/f/c/l/e/o/g3;

    return-void
.end method

.method public synthetic constructor <init>(JLjava/lang/String;Le/f/c/l/e/o/b3;Le/f/c/l/e/o/e3;Le/f/c/l/e/o/g3;Le/f/c/l/e/o/r0;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p6}, Le/f/c/l/e/o/t0;-><init>(JLjava/lang/String;Le/f/c/l/e/o/b3;Le/f/c/l/e/o/e3;Le/f/c/l/e/o/g3;)V

    return-void
.end method


# virtual methods
.method public a()Le/f/c/l/e/o/b3;
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/c/l/e/o/t0;->c:Le/f/c/l/e/o/b3;

    return-object v0
.end method

.method public b()Le/f/c/l/e/o/e3;
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/c/l/e/o/t0;->d:Le/f/c/l/e/o/e3;

    return-object v0
.end method

.method public c()Le/f/c/l/e/o/g3;
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/c/l/e/o/t0;->e:Le/f/c/l/e/o/g3;

    return-object v0
.end method

.method public d()J
    .locals 2

    .line 1
    iget-wide v0, p0, Le/f/c/l/e/o/t0;->a:J

    return-wide v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/c/l/e/o/t0;->b:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 1
    :cond_0
    instance-of v1, p1, Le/f/c/l/e/o/h3;

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    .line 2
    check-cast p1, Le/f/c/l/e/o/h3;

    .line 3
    iget-wide v3, p0, Le/f/c/l/e/o/t0;->a:J

    invoke-virtual {p1}, Le/f/c/l/e/o/h3;->d()J

    move-result-wide v5

    cmp-long v1, v3, v5

    if-nez v1, :cond_2

    iget-object v1, p0, Le/f/c/l/e/o/t0;->b:Ljava/lang/String;

    .line 4
    invoke-virtual {p1}, Le/f/c/l/e/o/h3;->e()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Le/f/c/l/e/o/t0;->c:Le/f/c/l/e/o/b3;

    .line 5
    invoke-virtual {p1}, Le/f/c/l/e/o/h3;->a()Le/f/c/l/e/o/b3;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Le/f/c/l/e/o/t0;->d:Le/f/c/l/e/o/e3;

    .line 6
    invoke-virtual {p1}, Le/f/c/l/e/o/h3;->b()Le/f/c/l/e/o/e3;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Le/f/c/l/e/o/t0;->e:Le/f/c/l/e/o/g3;

    if-nez v1, :cond_1

    .line 7
    invoke-virtual {p1}, Le/f/c/l/e/o/h3;->c()Le/f/c/l/e/o/g3;

    move-result-object p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Le/f/c/l/e/o/h3;->c()Le/f/c/l/e/o/g3;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_3
    return v2
.end method

.method public f()Le/f/c/l/e/o/c3;
    .locals 2

    .line 1
    new-instance v0, Le/f/c/l/e/o/s0;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Le/f/c/l/e/o/s0;-><init>(Le/f/c/l/e/o/h3;Le/f/c/l/e/o/r0;)V

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    .line 1
    iget-wide v0, p0, Le/f/c/l/e/o/t0;->a:J

    const/16 v2, 0x20

    ushr-long v2, v0, v2

    xor-long/2addr v0, v2

    long-to-int v1, v0

    const v0, 0xf4243

    xor-int/2addr v1, v0

    mul-int v1, v1, v0

    .line 2
    iget-object v2, p0, Le/f/c/l/e/o/t0;->b:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    xor-int/2addr v1, v2

    mul-int v1, v1, v0

    .line 3
    iget-object v2, p0, Le/f/c/l/e/o/t0;->c:Le/f/c/l/e/o/b3;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    xor-int/2addr v1, v2

    mul-int v1, v1, v0

    .line 4
    iget-object v2, p0, Le/f/c/l/e/o/t0;->d:Le/f/c/l/e/o/e3;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    xor-int/2addr v1, v2

    mul-int v1, v1, v0

    .line 5
    iget-object v0, p0, Le/f/c/l/e/o/t0;->e:Le/f/c/l/e/o/g3;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    xor-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Event{timestamp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Le/f/c/l/e/o/t0;->a:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/f/c/l/e/o/t0;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", app="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/f/c/l/e/o/t0;->c:Le/f/c/l/e/o/b3;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", device="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/f/c/l/e/o/t0;->d:Le/f/c/l/e/o/e3;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", log="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/f/c/l/e/o/t0;->e:Le/f/c/l/e/o/g3;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method