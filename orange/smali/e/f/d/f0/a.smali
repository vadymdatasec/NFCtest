.class public final Le/f/d/f0/a;
.super Le/f/d/d0/q;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Le/f/d/d0/q;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Le/f/d/f0/c;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Le/f/d/f0/c;->F()Le/f/d/f0/e;

    .line 2
    invoke-static {p1}, Le/f/d/f0/c;->a(Le/f/d/f0/c;)Le/f/d/f0/e;

    move-result-object v0

    sget-object v1, Le/f/d/f0/e;->f:Le/f/d/f0/e;

    if-ne v0, v1, :cond_0

    .line 3
    invoke-static {p1}, Le/f/d/f0/c;->d(Le/f/d/f0/c;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Le/f/d/f0/c;->a(Le/f/d/f0/c;Ljava/lang/String;)Ljava/lang/String;

    const/4 v0, 0x0

    .line 4
    invoke-static {p1, v0}, Le/f/d/f0/c;->b(Le/f/d/f0/c;Ljava/lang/String;)Ljava/lang/String;

    .line 5
    sget-object v0, Le/f/d/f0/e;->g:Le/f/d/f0/e;

    invoke-static {p1, v0}, Le/f/d/f0/c;->a(Le/f/d/f0/c;Le/f/d/f0/e;)Le/f/d/f0/e;

    return-void

    .line 6
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Expected a name but was "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Le/f/d/f0/c;->F()Le/f/d/f0/e;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " at line "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Le/f/d/f0/c;->b(Le/f/d/f0/c;)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " column "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Le/f/d/f0/c;->c(Le/f/d/f0/c;)I

    move-result p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
