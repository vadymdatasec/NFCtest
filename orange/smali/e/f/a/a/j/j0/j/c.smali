.class public final Le/f/a/a/j/j0/j/c;
.super Le/f/a/a/j/j0/j/m;
.source "SourceFile"


# instance fields
.field public final a:Le/f/a/a/j/l0/a;

.field public final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Le/f/a/a/d;",
            "Le/f/a/a/j/j0/j/k;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Le/f/a/a/j/l0/a;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/a/a/j/l0/a;",
            "Ljava/util/Map<",
            "Le/f/a/a/d;",
            "Le/f/a/a/j/j0/j/k;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Le/f/a/a/j/j0/j/m;-><init>()V

    if-eqz p1, :cond_1

    .line 2
    iput-object p1, p0, Le/f/a/a/j/j0/j/c;->a:Le/f/a/a/j/l0/a;

    if-eqz p2, :cond_0

    .line 3
    iput-object p2, p0, Le/f/a/a/j/j0/j/c;->b:Ljava/util/Map;

    return-void

    .line 4
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Null values"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 5
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Null clock"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public a()Le/f/a/a/j/l0/a;
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/a/a/j/j0/j/c;->a:Le/f/a/a/j/l0/a;

    return-object v0
.end method

.method public b()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Le/f/a/a/d;",
            "Le/f/a/a/j/j0/j/k;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/f/a/a/j/j0/j/c;->b:Ljava/util/Map;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 1
    :cond_0
    instance-of v1, p1, Le/f/a/a/j/j0/j/m;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    .line 2
    check-cast p1, Le/f/a/a/j/j0/j/m;

    .line 3
    iget-object v1, p0, Le/f/a/a/j/j0/j/c;->a:Le/f/a/a/j/l0/a;

    invoke-virtual {p1}, Le/f/a/a/j/j0/j/m;->a()Le/f/a/a/j/l0/a;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Le/f/a/a/j/j0/j/c;->b:Ljava/util/Map;

    .line 4
    invoke-virtual {p1}, Le/f/a/a/j/j0/j/m;->b()Ljava/util/Map;

    move-result-object p1

    invoke-interface {v1, p1}, Ljava/util/Map;->equals(Ljava/lang/Object;)Z

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
    .locals 2

    .line 1
    iget-object v0, p0, Le/f/a/a/j/j0/j/c;->a:Le/f/a/a/j/l0/a;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int v0, v0, v1

    .line 2
    iget-object v1, p0, Le/f/a/a/j/j0/j/c;->b:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SchedulerConfig{clock="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/f/a/a/j/j0/j/c;->a:Le/f/a/a/j/l0/a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", values="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/f/a/a/j/j0/j/c;->b:Ljava/util/Map;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
