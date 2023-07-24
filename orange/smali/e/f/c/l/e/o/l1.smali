.class public final Le/f/c/l/e/o/l1;
.super Le/f/c/l/e/o/z2;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:I

.field public final c:Le/f/c/l/e/o/p3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/c/l/e/o/p3<",
            "Le/f/c/l/e/o/y2;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;ILe/f/c/l/e/o/p3;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Le/f/c/l/e/o/p3<",
            "Le/f/c/l/e/o/y2;",
            ">;)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Le/f/c/l/e/o/z2;-><init>()V

    .line 3
    iput-object p1, p0, Le/f/c/l/e/o/l1;->a:Ljava/lang/String;

    .line 4
    iput p2, p0, Le/f/c/l/e/o/l1;->b:I

    .line 5
    iput-object p3, p0, Le/f/c/l/e/o/l1;->c:Le/f/c/l/e/o/p3;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILe/f/c/l/e/o/p3;Le/f/c/l/e/o/j1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Le/f/c/l/e/o/l1;-><init>(Ljava/lang/String;ILe/f/c/l/e/o/p3;)V

    return-void
.end method


# virtual methods
.method public a()Le/f/c/l/e/o/p3;
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
    iget-object v0, p0, Le/f/c/l/e/o/l1;->c:Le/f/c/l/e/o/p3;

    return-object v0
.end method

.method public b()I
    .locals 1

    .line 1
    iget v0, p0, Le/f/c/l/e/o/l1;->b:I

    return v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/c/l/e/o/l1;->a:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 1
    :cond_0
    instance-of v1, p1, Le/f/c/l/e/o/z2;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    .line 2
    check-cast p1, Le/f/c/l/e/o/z2;

    .line 3
    iget-object v1, p0, Le/f/c/l/e/o/l1;->a:Ljava/lang/String;

    invoke-virtual {p1}, Le/f/c/l/e/o/z2;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget v1, p0, Le/f/c/l/e/o/l1;->b:I

    .line 4
    invoke-virtual {p1}, Le/f/c/l/e/o/z2;->b()I

    move-result v3

    if-ne v1, v3, :cond_1

    iget-object v1, p0, Le/f/c/l/e/o/l1;->c:Le/f/c/l/e/o/p3;

    .line 5
    invoke-virtual {p1}, Le/f/c/l/e/o/z2;->a()Le/f/c/l/e/o/p3;

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
    iget-object v0, p0, Le/f/c/l/e/o/l1;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int v0, v0, v1

    .line 2
    iget v2, p0, Le/f/c/l/e/o/l1;->b:I

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 3
    iget-object v1, p0, Le/f/c/l/e/o/l1;->c:Le/f/c/l/e/o/p3;

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

    const-string v1, "Thread{name="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/f/c/l/e/o/l1;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", importance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Le/f/c/l/e/o/l1;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", frames="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/f/c/l/e/o/l1;->c:Le/f/c/l/e/o/p3;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
