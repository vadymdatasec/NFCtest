.class public final Le/f/c/l/e/o/f1;
.super Le/f/c/l/e/o/t2;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Le/f/c/l/e/o/p3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/c/l/e/o/p3<",
            "Le/f/c/l/e/o/y2;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Le/f/c/l/e/o/t2;

.field public final e:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Le/f/c/l/e/o/p3;Le/f/c/l/e/o/t2;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Le/f/c/l/e/o/p3<",
            "Le/f/c/l/e/o/y2;",
            ">;",
            "Le/f/c/l/e/o/t2;",
            "I)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Le/f/c/l/e/o/t2;-><init>()V

    .line 3
    iput-object p1, p0, Le/f/c/l/e/o/f1;->a:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Le/f/c/l/e/o/f1;->b:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Le/f/c/l/e/o/f1;->c:Le/f/c/l/e/o/p3;

    .line 6
    iput-object p4, p0, Le/f/c/l/e/o/f1;->d:Le/f/c/l/e/o/t2;

    .line 7
    iput p5, p0, Le/f/c/l/e/o/f1;->e:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Le/f/c/l/e/o/p3;Le/f/c/l/e/o/t2;ILe/f/c/l/e/o/d1;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Le/f/c/l/e/o/f1;-><init>(Ljava/lang/String;Ljava/lang/String;Le/f/c/l/e/o/p3;Le/f/c/l/e/o/t2;I)V

    return-void
.end method


# virtual methods
.method public a()Le/f/c/l/e/o/t2;
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/c/l/e/o/f1;->d:Le/f/c/l/e/o/t2;

    return-object v0
.end method

.method public b()Le/f/c/l/e/o/p3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Le/f/c/l/e/o/p3<",
            "Le/f/c/l/e/o/y2;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/f/c/l/e/o/f1;->c:Le/f/c/l/e/o/p3;

    return-object v0
.end method

.method public c()I
    .locals 1

    .line 1
    iget v0, p0, Le/f/c/l/e/o/f1;->e:I

    return v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/c/l/e/o/f1;->b:Ljava/lang/String;

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/c/l/e/o/f1;->a:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 1
    :cond_0
    instance-of v1, p1, Le/f/c/l/e/o/t2;

    const/4 v2, 0x0

    if-eqz v1, :cond_4

    .line 2
    check-cast p1, Le/f/c/l/e/o/t2;

    .line 3
    iget-object v1, p0, Le/f/c/l/e/o/f1;->a:Ljava/lang/String;

    invoke-virtual {p1}, Le/f/c/l/e/o/t2;->e()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Le/f/c/l/e/o/f1;->b:Ljava/lang/String;

    if-nez v1, :cond_1

    .line 4
    invoke-virtual {p1}, Le/f/c/l/e/o/t2;->d()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_3

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Le/f/c/l/e/o/t2;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    :goto_0
    iget-object v1, p0, Le/f/c/l/e/o/f1;->c:Le/f/c/l/e/o/p3;

    .line 5
    invoke-virtual {p1}, Le/f/c/l/e/o/t2;->b()Le/f/c/l/e/o/p3;

    move-result-object v3

    invoke-virtual {v1, v3}, Le/f/c/l/e/o/p3;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Le/f/c/l/e/o/f1;->d:Le/f/c/l/e/o/t2;

    if-nez v1, :cond_2

    .line 6
    invoke-virtual {p1}, Le/f/c/l/e/o/t2;->a()Le/f/c/l/e/o/t2;

    move-result-object v1

    if-nez v1, :cond_3

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Le/f/c/l/e/o/t2;->a()Le/f/c/l/e/o/t2;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    :goto_1
    iget v1, p0, Le/f/c/l/e/o/f1;->e:I

    .line 7
    invoke-virtual {p1}, Le/f/c/l/e/o/t2;->c()I

    move-result p1

    if-ne v1, p1, :cond_3

    goto :goto_2

    :cond_3
    const/4 v0, 0x0

    :goto_2
    return v0

    :cond_4
    return v2
.end method

.method public hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, Le/f/c/l/e/o/f1;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int v0, v0, v1

    .line 2
    iget-object v2, p0, Le/f/c/l/e/o/f1;->b:Ljava/lang/String;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 3
    iget-object v2, p0, Le/f/c/l/e/o/f1;->c:Le/f/c/l/e/o/p3;

    invoke-virtual {v2}, Le/f/c/l/e/o/p3;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 4
    iget-object v2, p0, Le/f/c/l/e/o/f1;->d:Le/f/c/l/e/o/t2;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_1
    xor-int/2addr v0, v3

    mul-int v0, v0, v1

    .line 5
    iget v1, p0, Le/f/c/l/e/o/f1;->e:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Exception{type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/f/c/l/e/o/f1;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", reason="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/f/c/l/e/o/f1;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", frames="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/f/c/l/e/o/f1;->c:Le/f/c/l/e/o/p3;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", causedBy="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/f/c/l/e/o/f1;->d:Le/f/c/l/e/o/t2;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", overflowCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Le/f/c/l/e/o/f1;->e:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
