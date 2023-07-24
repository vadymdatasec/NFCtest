.class public final Le/f/c/l/e/o/w;
.super Le/f/c/l/e/o/b2;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/Integer;

.field public d:Ljava/lang/String;

.field public e:Ljava/lang/String;

.field public f:Ljava/lang/String;

.field public g:Le/f/c/l/e/o/m3;

.field public h:Le/f/c/l/e/o/h2;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Le/f/c/l/e/o/b2;-><init>()V

    return-void
.end method

.method public constructor <init>(Le/f/c/l/e/o/o3;)V
    .locals 1

    .line 3
    invoke-direct {p0}, Le/f/c/l/e/o/b2;-><init>()V

    .line 4
    invoke-virtual {p1}, Le/f/c/l/e/o/o3;->g()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Le/f/c/l/e/o/w;->a:Ljava/lang/String;

    .line 5
    invoke-virtual {p1}, Le/f/c/l/e/o/o3;->c()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Le/f/c/l/e/o/w;->b:Ljava/lang/String;

    .line 6
    invoke-virtual {p1}, Le/f/c/l/e/o/o3;->f()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Le/f/c/l/e/o/w;->c:Ljava/lang/Integer;

    .line 7
    invoke-virtual {p1}, Le/f/c/l/e/o/o3;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Le/f/c/l/e/o/w;->d:Ljava/lang/String;

    .line 8
    invoke-virtual {p1}, Le/f/c/l/e/o/o3;->a()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Le/f/c/l/e/o/w;->e:Ljava/lang/String;

    .line 9
    invoke-virtual {p1}, Le/f/c/l/e/o/o3;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Le/f/c/l/e/o/w;->f:Ljava/lang/String;

    .line 10
    invoke-virtual {p1}, Le/f/c/l/e/o/o3;->h()Le/f/c/l/e/o/m3;

    move-result-object v0

    iput-object v0, p0, Le/f/c/l/e/o/w;->g:Le/f/c/l/e/o/m3;

    .line 11
    invoke-virtual {p1}, Le/f/c/l/e/o/o3;->e()Le/f/c/l/e/o/h2;

    move-result-object p1

    iput-object p1, p0, Le/f/c/l/e/o/w;->h:Le/f/c/l/e/o/h2;

    return-void
.end method

.method public synthetic constructor <init>(Le/f/c/l/e/o/o3;Le/f/c/l/e/o/v;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Le/f/c/l/e/o/w;-><init>(Le/f/c/l/e/o/o3;)V

    return-void
.end method


# virtual methods
.method public a(I)Le/f/c/l/e/o/b2;
    .locals 0

    .line 1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Le/f/c/l/e/o/w;->c:Ljava/lang/Integer;

    return-object p0
.end method

.method public a(Le/f/c/l/e/o/h2;)Le/f/c/l/e/o/b2;
    .locals 0

    .line 5
    iput-object p1, p0, Le/f/c/l/e/o/w;->h:Le/f/c/l/e/o/h2;

    return-object p0
.end method

.method public a(Le/f/c/l/e/o/m3;)Le/f/c/l/e/o/b2;
    .locals 0

    .line 4
    iput-object p1, p0, Le/f/c/l/e/o/w;->g:Le/f/c/l/e/o/m3;

    return-object p0
.end method

.method public a(Ljava/lang/String;)Le/f/c/l/e/o/b2;
    .locals 1

    if-eqz p1, :cond_0

    .line 2
    iput-object p1, p0, Le/f/c/l/e/o/w;->e:Ljava/lang/String;

    return-object p0

    .line 3
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null buildVersion"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public a()Le/f/c/l/e/o/o3;
    .locals 12

    .line 6
    iget-object v0, p0, Le/f/c/l/e/o/w;->a:Ljava/lang/String;

    const-string v1, ""

    if-nez v0, :cond_0

    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " sdkVersion"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 8
    :cond_0
    iget-object v0, p0, Le/f/c/l/e/o/w;->b:Ljava/lang/String;

    if-nez v0, :cond_1

    .line 9
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " gmpAppId"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 10
    :cond_1
    iget-object v0, p0, Le/f/c/l/e/o/w;->c:Ljava/lang/Integer;

    if-nez v0, :cond_2

    .line 11
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " platform"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 12
    :cond_2
    iget-object v0, p0, Le/f/c/l/e/o/w;->d:Ljava/lang/String;

    if-nez v0, :cond_3

    .line 13
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " installationUuid"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 14
    :cond_3
    iget-object v0, p0, Le/f/c/l/e/o/w;->e:Ljava/lang/String;

    if-nez v0, :cond_4

    .line 15
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " buildVersion"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 16
    :cond_4
    iget-object v0, p0, Le/f/c/l/e/o/w;->f:Ljava/lang/String;

    if-nez v0, :cond_5

    .line 17
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " displayVersion"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 18
    :cond_5
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 19
    new-instance v0, Le/f/c/l/e/o/x;

    iget-object v3, p0, Le/f/c/l/e/o/w;->a:Ljava/lang/String;

    iget-object v4, p0, Le/f/c/l/e/o/w;->b:Ljava/lang/String;

    iget-object v1, p0, Le/f/c/l/e/o/w;->c:Ljava/lang/Integer;

    .line 20
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget-object v6, p0, Le/f/c/l/e/o/w;->d:Ljava/lang/String;

    iget-object v7, p0, Le/f/c/l/e/o/w;->e:Ljava/lang/String;

    iget-object v8, p0, Le/f/c/l/e/o/w;->f:Ljava/lang/String;

    iget-object v9, p0, Le/f/c/l/e/o/w;->g:Le/f/c/l/e/o/m3;

    iget-object v10, p0, Le/f/c/l/e/o/w;->h:Le/f/c/l/e/o/h2;

    const/4 v11, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v11}, Le/f/c/l/e/o/x;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Le/f/c/l/e/o/m3;Le/f/c/l/e/o/h2;Le/f/c/l/e/o/v;)V

    return-object v0

    .line 21
    :cond_6
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

.method public b(Ljava/lang/String;)Le/f/c/l/e/o/b2;
    .locals 1

    if-eqz p1, :cond_0

    .line 1
    iput-object p1, p0, Le/f/c/l/e/o/w;->f:Ljava/lang/String;

    return-object p0

    .line 2
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null displayVersion"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public c(Ljava/lang/String;)Le/f/c/l/e/o/b2;
    .locals 1

    if-eqz p1, :cond_0

    .line 1
    iput-object p1, p0, Le/f/c/l/e/o/w;->b:Ljava/lang/String;

    return-object p0

    .line 2
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null gmpAppId"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public d(Ljava/lang/String;)Le/f/c/l/e/o/b2;
    .locals 1

    if-eqz p1, :cond_0

    .line 1
    iput-object p1, p0, Le/f/c/l/e/o/w;->d:Ljava/lang/String;

    return-object p0

    .line 2
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null installationUuid"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public e(Ljava/lang/String;)Le/f/c/l/e/o/b2;
    .locals 1

    if-eqz p1, :cond_0

    .line 1
    iput-object p1, p0, Le/f/c/l/e/o/w;->a:Ljava/lang/String;

    return-object p0

    .line 2
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null sdkVersion"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
