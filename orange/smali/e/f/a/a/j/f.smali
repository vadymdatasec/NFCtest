.class public final Le/f/a/a/j/f;
.super Le/f/a/a/j/w;
.source "SourceFile"


# instance fields
.field public final a:Le/f/a/a/j/x;

.field public final b:Ljava/lang/String;

.field public final c:Le/f/a/a/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/a/a/c<",
            "*>;"
        }
    .end annotation
.end field

.field public final d:Le/f/a/a/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/a/a/e<",
            "*[B>;"
        }
    .end annotation
.end field

.field public final e:Le/f/a/a/b;


# direct methods
.method public constructor <init>(Le/f/a/a/j/x;Ljava/lang/String;Le/f/a/a/c;Le/f/a/a/e;Le/f/a/a/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/a/a/j/x;",
            "Ljava/lang/String;",
            "Le/f/a/a/c<",
            "*>;",
            "Le/f/a/a/e<",
            "*[B>;",
            "Le/f/a/a/b;",
            ")V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Le/f/a/a/j/w;-><init>()V

    .line 3
    iput-object p1, p0, Le/f/a/a/j/f;->a:Le/f/a/a/j/x;

    .line 4
    iput-object p2, p0, Le/f/a/a/j/f;->b:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Le/f/a/a/j/f;->c:Le/f/a/a/c;

    .line 6
    iput-object p4, p0, Le/f/a/a/j/f;->d:Le/f/a/a/e;

    .line 7
    iput-object p5, p0, Le/f/a/a/j/f;->e:Le/f/a/a/b;

    return-void
.end method

.method public synthetic constructor <init>(Le/f/a/a/j/x;Ljava/lang/String;Le/f/a/a/c;Le/f/a/a/e;Le/f/a/a/b;Le/f/a/a/j/d;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Le/f/a/a/j/f;-><init>(Le/f/a/a/j/x;Ljava/lang/String;Le/f/a/a/c;Le/f/a/a/e;Le/f/a/a/b;)V

    return-void
.end method


# virtual methods
.method public a()Le/f/a/a/b;
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/a/a/j/f;->e:Le/f/a/a/b;

    return-object v0
.end method

.method public b()Le/f/a/a/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Le/f/a/a/c<",
            "*>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/f/a/a/j/f;->c:Le/f/a/a/c;

    return-object v0
.end method

.method public d()Le/f/a/a/e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Le/f/a/a/e<",
            "*[B>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/f/a/a/j/f;->d:Le/f/a/a/e;

    return-object v0
.end method

.method public e()Le/f/a/a/j/x;
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/a/a/j/f;->a:Le/f/a/a/j/x;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 1
    :cond_0
    instance-of v1, p1, Le/f/a/a/j/w;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    .line 2
    check-cast p1, Le/f/a/a/j/w;

    .line 3
    iget-object v1, p0, Le/f/a/a/j/f;->a:Le/f/a/a/j/x;

    invoke-virtual {p1}, Le/f/a/a/j/w;->e()Le/f/a/a/j/x;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Le/f/a/a/j/f;->b:Ljava/lang/String;

    .line 4
    invoke-virtual {p1}, Le/f/a/a/j/w;->f()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Le/f/a/a/j/f;->c:Le/f/a/a/c;

    .line 5
    invoke-virtual {p1}, Le/f/a/a/j/w;->b()Le/f/a/a/c;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Le/f/a/a/j/f;->d:Le/f/a/a/e;

    .line 6
    invoke-virtual {p1}, Le/f/a/a/j/w;->d()Le/f/a/a/e;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Le/f/a/a/j/f;->e:Le/f/a/a/b;

    .line 7
    invoke-virtual {p1}, Le/f/a/a/j/w;->a()Le/f/a/a/b;

    move-result-object p1

    invoke-virtual {v1, p1}, Le/f/a/a/b;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_2
    return v2
.end method

.method public f()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/a/a/j/f;->b:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Le/f/a/a/j/f;->a:Le/f/a/a/j/x;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int v0, v0, v1

    .line 2
    iget-object v2, p0, Le/f/a/a/j/f;->b:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 3
    iget-object v2, p0, Le/f/a/a/j/f;->c:Le/f/a/a/c;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 4
    iget-object v2, p0, Le/f/a/a/j/f;->d:Le/f/a/a/e;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 5
    iget-object v1, p0, Le/f/a/a/j/f;->e:Le/f/a/a/b;

    invoke-virtual {v1}, Le/f/a/a/b;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SendRequest{transportContext="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/f/a/a/j/f;->a:Le/f/a/a/j/x;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", transportName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/f/a/a/j/f;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", event="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/f/a/a/j/f;->c:Le/f/a/a/c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", transformer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/f/a/a/j/f;->d:Le/f/a/a/e;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", encoding="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/f/a/a/j/f;->e:Le/f/a/a/b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
