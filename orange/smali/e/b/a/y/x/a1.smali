.class public final Le/b/a/y/x/a1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/b/a/y/n;


# static fields
.field public static final j:Le/b/a/e0/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/b/a/e0/o<",
            "Ljava/lang/Class<",
            "*>;[B>;"
        }
    .end annotation
.end field


# instance fields
.field public final b:Le/b/a/y/x/f1/b;

.field public final c:Le/b/a/y/n;

.field public final d:Le/b/a/y/n;

.field public final e:I

.field public final f:I

.field public final g:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public final h:Le/b/a/y/r;

.field public final i:Le/b/a/y/v;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/b/a/y/v<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Le/b/a/e0/o;

    const-wide/16 v1, 0x32

    invoke-direct {v0, v1, v2}, Le/b/a/e0/o;-><init>(J)V

    sput-object v0, Le/b/a/y/x/a1;->j:Le/b/a/e0/o;

    return-void
.end method

.method public constructor <init>(Le/b/a/y/x/f1/b;Le/b/a/y/n;Le/b/a/y/n;IILe/b/a/y/v;Ljava/lang/Class;Le/b/a/y/r;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/y/x/f1/b;",
            "Le/b/a/y/n;",
            "Le/b/a/y/n;",
            "II",
            "Le/b/a/y/v<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;",
            "Le/b/a/y/r;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/b/a/y/x/a1;->b:Le/b/a/y/x/f1/b;

    .line 3
    iput-object p2, p0, Le/b/a/y/x/a1;->c:Le/b/a/y/n;

    .line 4
    iput-object p3, p0, Le/b/a/y/x/a1;->d:Le/b/a/y/n;

    .line 5
    iput p4, p0, Le/b/a/y/x/a1;->e:I

    .line 6
    iput p5, p0, Le/b/a/y/x/a1;->f:I

    .line 7
    iput-object p6, p0, Le/b/a/y/x/a1;->i:Le/b/a/y/v;

    .line 8
    iput-object p7, p0, Le/b/a/y/x/a1;->g:Ljava/lang/Class;

    .line 9
    iput-object p8, p0, Le/b/a/y/x/a1;->h:Le/b/a/y/r;

    return-void
.end method


# virtual methods
.method public a(Ljava/security/MessageDigest;)V
    .locals 3

    .line 1
    iget-object v0, p0, Le/b/a/y/x/a1;->b:Le/b/a/y/x/f1/b;

    const-class v1, [B

    const/16 v2, 0x8

    invoke-interface {v0, v2, v1}, Le/b/a/y/x/f1/b;->a(ILjava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    .line 2
    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v1

    iget v2, p0, Le/b/a/y/x/a1;->e:I

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    iget v2, p0, Le/b/a/y/x/a1;->f:I

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->array()[B

    .line 3
    iget-object v1, p0, Le/b/a/y/x/a1;->d:Le/b/a/y/n;

    invoke-interface {v1, p1}, Le/b/a/y/n;->a(Ljava/security/MessageDigest;)V

    .line 4
    iget-object v1, p0, Le/b/a/y/x/a1;->c:Le/b/a/y/n;

    invoke-interface {v1, p1}, Le/b/a/y/n;->a(Ljava/security/MessageDigest;)V

    .line 5
    invoke-virtual {p1, v0}, Ljava/security/MessageDigest;->update([B)V

    .line 6
    iget-object v1, p0, Le/b/a/y/x/a1;->i:Le/b/a/y/v;

    if-eqz v1, :cond_0

    .line 7
    invoke-interface {v1, p1}, Le/b/a/y/n;->a(Ljava/security/MessageDigest;)V

    .line 8
    :cond_0
    iget-object v1, p0, Le/b/a/y/x/a1;->h:Le/b/a/y/r;

    invoke-virtual {v1, p1}, Le/b/a/y/r;->a(Ljava/security/MessageDigest;)V

    .line 9
    invoke-virtual {p0}, Le/b/a/y/x/a1;->a()[B

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/security/MessageDigest;->update([B)V

    .line 10
    iget-object p1, p0, Le/b/a/y/x/a1;->b:Le/b/a/y/x/f1/b;

    invoke-interface {p1, v0}, Le/b/a/y/x/f1/b;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public final a()[B
    .locals 3

    .line 11
    sget-object v0, Le/b/a/y/x/a1;->j:Le/b/a/e0/o;

    iget-object v1, p0, Le/b/a/y/x/a1;->g:Ljava/lang/Class;

    invoke-virtual {v0, v1}, Le/b/a/e0/o;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    if-nez v0, :cond_0

    .line 12
    iget-object v0, p0, Le/b/a/y/x/a1;->g:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Le/b/a/y/n;->a:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    .line 13
    sget-object v1, Le/b/a/y/x/a1;->j:Le/b/a/e0/o;

    iget-object v2, p0, Le/b/a/y/x/a1;->g:Ljava/lang/Class;

    invoke-virtual {v1, v2, v0}, Le/b/a/e0/o;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    instance-of v0, p1, Le/b/a/y/x/a1;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 2
    check-cast p1, Le/b/a/y/x/a1;

    .line 3
    iget v0, p0, Le/b/a/y/x/a1;->f:I

    iget v2, p1, Le/b/a/y/x/a1;->f:I

    if-ne v0, v2, :cond_0

    iget v0, p0, Le/b/a/y/x/a1;->e:I

    iget v2, p1, Le/b/a/y/x/a1;->e:I

    if-ne v0, v2, :cond_0

    iget-object v0, p0, Le/b/a/y/x/a1;->i:Le/b/a/y/v;

    iget-object v2, p1, Le/b/a/y/x/a1;->i:Le/b/a/y/v;

    .line 4
    invoke-static {v0, v2}, Le/b/a/e0/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Le/b/a/y/x/a1;->g:Ljava/lang/Class;

    iget-object v2, p1, Le/b/a/y/x/a1;->g:Ljava/lang/Class;

    .line 5
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Le/b/a/y/x/a1;->c:Le/b/a/y/n;

    iget-object v2, p1, Le/b/a/y/x/a1;->c:Le/b/a/y/n;

    .line 6
    invoke-interface {v0, v2}, Le/b/a/y/n;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Le/b/a/y/x/a1;->d:Le/b/a/y/n;

    iget-object v2, p1, Le/b/a/y/x/a1;->d:Le/b/a/y/n;

    .line 7
    invoke-interface {v0, v2}, Le/b/a/y/n;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Le/b/a/y/x/a1;->h:Le/b/a/y/r;

    iget-object p1, p1, Le/b/a/y/x/a1;->h:Le/b/a/y/r;

    .line 8
    invoke-virtual {v0, p1}, Le/b/a/y/r;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Le/b/a/y/x/a1;->c:Le/b/a/y/n;

    invoke-interface {v0}, Le/b/a/y/n;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    .line 2
    iget-object v1, p0, Le/b/a/y/x/a1;->d:Le/b/a/y/n;

    invoke-interface {v1}, Le/b/a/y/n;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 3
    iget v1, p0, Le/b/a/y/x/a1;->e:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 4
    iget v1, p0, Le/b/a/y/x/a1;->f:I

    add-int/2addr v0, v1

    .line 5
    iget-object v1, p0, Le/b/a/y/x/a1;->i:Le/b/a/y/v;

    if-eqz v1, :cond_0

    mul-int/lit8 v0, v0, 0x1f

    .line 6
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    :cond_0
    mul-int/lit8 v0, v0, 0x1f

    .line 7
    iget-object v1, p0, Le/b/a/y/x/a1;->g:Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 8
    iget-object v1, p0, Le/b/a/y/x/a1;->h:Le/b/a/y/r;

    invoke-virtual {v1}, Le/b/a/y/r;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ResourceCacheKey{sourceKey="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/b/a/y/x/a1;->c:Le/b/a/y/n;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", signature="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/b/a/y/x/a1;->d:Le/b/a/y/n;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", width="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Le/b/a/y/x/a1;->e:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", height="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Le/b/a/y/x/a1;->f:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", decodedResourceClass="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/b/a/y/x/a1;->g:Ljava/lang/Class;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", transformation=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/b/a/y/x/a1;->i:Le/b/a/y/v;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, ", options="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/b/a/y/x/a1;->h:Le/b/a/y/r;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method