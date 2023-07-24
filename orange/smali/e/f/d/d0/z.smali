.class public Le/f/d/d0/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Map$Entry;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/Map$Entry<",
        "Ljava/lang/String;",
        "TV;>;"
    }
.end annotation


# instance fields
.field public final b:Ljava/lang/String;

.field public c:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TV;"
        }
    .end annotation
.end field

.field public final d:I

.field public e:Le/f/d/d0/z;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/d/d0/z<",
            "TV;>;"
        }
    .end annotation
.end field

.field public f:Le/f/d/d0/z;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/d/d0/z<",
            "TV;>;"
        }
    .end annotation
.end field

.field public g:Le/f/d/d0/z;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/d/d0/z<",
            "TV;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 7

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    .line 1
    invoke-direct/range {v0 .. v6}, Le/f/d/d0/z;-><init>(Ljava/lang/String;Ljava/lang/Object;ILe/f/d/d0/z;Le/f/d/d0/z;Le/f/d/d0/z;)V

    .line 2
    iput-object p0, p0, Le/f/d/d0/z;->g:Le/f/d/d0/z;

    iput-object p0, p0, Le/f/d/d0/z;->f:Le/f/d/d0/z;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Object;ILe/f/d/d0/z;Le/f/d/d0/z;Le/f/d/d0/z;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "TV;I",
            "Le/f/d/d0/z<",
            "TV;>;",
            "Le/f/d/d0/z<",
            "TV;>;",
            "Le/f/d/d0/z<",
            "TV;>;)V"
        }
    .end annotation

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Le/f/d/d0/z;->b:Ljava/lang/String;

    .line 5
    iput-object p2, p0, Le/f/d/d0/z;->c:Ljava/lang/Object;

    .line 6
    iput p3, p0, Le/f/d/d0/z;->d:I

    .line 7
    iput-object p4, p0, Le/f/d/d0/z;->e:Le/f/d/d0/z;

    .line 8
    iput-object p5, p0, Le/f/d/d0/z;->f:Le/f/d/d0/z;

    .line 9
    iput-object p6, p0, Le/f/d/d0/z;->g:Le/f/d/d0/z;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    instance-of v0, p1, Ljava/util/Map$Entry;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 2
    :cond_0
    check-cast p1, Ljava/util/Map$Entry;

    .line 3
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    .line 4
    iget-object v2, p0, Le/f/d/d0/z;->b:Ljava/lang/String;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Le/f/d/d0/z;->c:Ljava/lang/Object;

    if-nez p1, :cond_1

    if-nez v0, :cond_2

    goto :goto_0

    :cond_1
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    :goto_0
    const/4 v1, 0x1

    :cond_2
    return v1
.end method

.method public bridge synthetic getKey()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Le/f/d/d0/z;->getKey()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getKey()Ljava/lang/String;
    .locals 1

    .line 2
    iget-object v0, p0, Le/f/d/d0/z;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final getValue()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TV;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/f/d/d0/z;->c:Ljava/lang/Object;

    return-object v0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Le/f/d/d0/z;->b:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    iget-object v2, p0, Le/f/d/d0/z;->c:Ljava/lang/Object;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    xor-int/2addr v0, v1

    return v0
.end method

.method public final setValue(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)TV;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/f/d/d0/z;->c:Ljava/lang/Object;

    .line 2
    iput-object p1, p0, Le/f/d/d0/z;->c:Ljava/lang/Object;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Le/f/d/d0/z;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/f/d/d0/z;->c:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
