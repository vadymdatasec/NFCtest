.class public final Le/f/c/l/e/o/z0;
.super Le/f/c/l/e/o/a3;
.source "SourceFile"


# instance fields
.field public final a:Le/f/c/l/e/o/p3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/c/l/e/o/p3<",
            "Le/f/c/l/e/o/z2;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Le/f/c/l/e/o/t2;

.field public final c:Le/f/c/l/e/o/v2;

.field public final d:Le/f/c/l/e/o/p3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/c/l/e/o/p3<",
            "Le/f/c/l/e/o/q2;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Le/f/c/l/e/o/p3;Le/f/c/l/e/o/t2;Le/f/c/l/e/o/v2;Le/f/c/l/e/o/p3;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/c/l/e/o/p3<",
            "Le/f/c/l/e/o/z2;",
            ">;",
            "Le/f/c/l/e/o/t2;",
            "Le/f/c/l/e/o/v2;",
            "Le/f/c/l/e/o/p3<",
            "Le/f/c/l/e/o/q2;",
            ">;)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Le/f/c/l/e/o/a3;-><init>()V

    .line 3
    iput-object p1, p0, Le/f/c/l/e/o/z0;->a:Le/f/c/l/e/o/p3;

    .line 4
    iput-object p2, p0, Le/f/c/l/e/o/z0;->b:Le/f/c/l/e/o/t2;

    .line 5
    iput-object p3, p0, Le/f/c/l/e/o/z0;->c:Le/f/c/l/e/o/v2;

    .line 6
    iput-object p4, p0, Le/f/c/l/e/o/z0;->d:Le/f/c/l/e/o/p3;

    return-void
.end method

.method public synthetic constructor <init>(Le/f/c/l/e/o/p3;Le/f/c/l/e/o/t2;Le/f/c/l/e/o/v2;Le/f/c/l/e/o/p3;Le/f/c/l/e/o/x0;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Le/f/c/l/e/o/z0;-><init>(Le/f/c/l/e/o/p3;Le/f/c/l/e/o/t2;Le/f/c/l/e/o/v2;Le/f/c/l/e/o/p3;)V

    return-void
.end method


# virtual methods
.method public a()Le/f/c/l/e/o/p3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Le/f/c/l/e/o/p3<",
            "Le/f/c/l/e/o/q2;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/f/c/l/e/o/z0;->d:Le/f/c/l/e/o/p3;

    return-object v0
.end method

.method public b()Le/f/c/l/e/o/t2;
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/c/l/e/o/z0;->b:Le/f/c/l/e/o/t2;

    return-object v0
.end method

.method public c()Le/f/c/l/e/o/v2;
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/c/l/e/o/z0;->c:Le/f/c/l/e/o/v2;

    return-object v0
.end method

.method public d()Le/f/c/l/e/o/p3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Le/f/c/l/e/o/p3<",
            "Le/f/c/l/e/o/z2;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/f/c/l/e/o/z0;->a:Le/f/c/l/e/o/p3;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 1
    :cond_0
    instance-of v1, p1, Le/f/c/l/e/o/a3;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    .line 2
    check-cast p1, Le/f/c/l/e/o/a3;

    .line 3
    iget-object v1, p0, Le/f/c/l/e/o/z0;->a:Le/f/c/l/e/o/p3;

    invoke-virtual {p1}, Le/f/c/l/e/o/a3;->d()Le/f/c/l/e/o/p3;

    move-result-object v3

    invoke-virtual {v1, v3}, Le/f/c/l/e/o/p3;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Le/f/c/l/e/o/z0;->b:Le/f/c/l/e/o/t2;

    .line 4
    invoke-virtual {p1}, Le/f/c/l/e/o/a3;->b()Le/f/c/l/e/o/t2;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Le/f/c/l/e/o/z0;->c:Le/f/c/l/e/o/v2;

    .line 5
    invoke-virtual {p1}, Le/f/c/l/e/o/a3;->c()Le/f/c/l/e/o/v2;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Le/f/c/l/e/o/z0;->d:Le/f/c/l/e/o/p3;

    .line 6
    invoke-virtual {p1}, Le/f/c/l/e/o/a3;->a()Le/f/c/l/e/o/p3;

    move-result-object p1

    invoke-virtual {v1, p1}, Le/f/c/l/e/o/p3;->equals(Ljava/lang/Object;)Z

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

.method public hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Le/f/c/l/e/o/z0;->a:Le/f/c/l/e/o/p3;

    invoke-virtual {v0}, Le/f/c/l/e/o/p3;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int v0, v0, v1

    .line 2
    iget-object v2, p0, Le/f/c/l/e/o/z0;->b:Le/f/c/l/e/o/t2;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 3
    iget-object v2, p0, Le/f/c/l/e/o/z0;->c:Le/f/c/l/e/o/v2;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 4
    iget-object v1, p0, Le/f/c/l/e/o/z0;->d:Le/f/c/l/e/o/p3;

    invoke-virtual {v1}, Le/f/c/l/e/o/p3;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Execution{threads="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/f/c/l/e/o/z0;->a:Le/f/c/l/e/o/p3;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", exception="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/f/c/l/e/o/z0;->b:Le/f/c/l/e/o/t2;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", signal="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/f/c/l/e/o/z0;->c:Le/f/c/l/e/o/v2;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", binaries="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/f/c/l/e/o/z0;->d:Le/f/c/l/e/o/p3;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method