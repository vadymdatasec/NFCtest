.class public final Le/f/c/s/u/e;
.super Le/f/c/s/u/k;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/Long;

.field public c:Le/f/c/s/u/l;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Le/f/c/s/u/k;-><init>()V

    return-void
.end method


# virtual methods
.method public a(J)Le/f/c/s/u/k;
    .locals 0

    .line 2
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Le/f/c/s/u/e;->b:Ljava/lang/Long;

    return-object p0
.end method

.method public a(Le/f/c/s/u/l;)Le/f/c/s/u/k;
    .locals 0

    .line 3
    iput-object p1, p0, Le/f/c/s/u/e;->c:Le/f/c/s/u/l;

    return-object p0
.end method

.method public a(Ljava/lang/String;)Le/f/c/s/u/k;
    .locals 0

    .line 1
    iput-object p1, p0, Le/f/c/s/u/e;->a:Ljava/lang/String;

    return-object p0
.end method

.method public a()Le/f/c/s/u/m;
    .locals 8

    .line 4
    iget-object v0, p0, Le/f/c/s/u/e;->b:Ljava/lang/Long;

    const-string v1, ""

    if-nez v0, :cond_0

    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " tokenExpirationTimestamp"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 6
    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 7
    new-instance v0, Le/f/c/s/u/f;

    iget-object v3, p0, Le/f/c/s/u/e;->a:Ljava/lang/String;

    iget-object v1, p0, Le/f/c/s/u/e;->b:Ljava/lang/Long;

    .line 8
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    iget-object v6, p0, Le/f/c/s/u/e;->c:Le/f/c/s/u/l;

    const/4 v7, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v7}, Le/f/c/s/u/f;-><init>(Ljava/lang/String;JLe/f/c/s/u/l;Le/f/c/s/u/d;)V

    return-object v0

    .line 9
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Missing required properties:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
