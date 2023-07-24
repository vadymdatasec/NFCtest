.class public final Le/f/b/c/q;
.super Le/f/b/c/e;
.source "SourceFile"


# instance fields
.field public final a:Ljava/io/File;

.field public final b:Le/f/b/b/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/b/b/h<",
            "Le/f/b/c/n;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public varargs constructor <init>(Ljava/io/File;[Le/f/b/c/n;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Le/f/b/c/e;-><init>()V

    .line 3
    invoke-static {p1}, Le/f/b/a/p;->a(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p1, Ljava/io/File;

    iput-object p1, p0, Le/f/b/c/q;->a:Ljava/io/File;

    .line 4
    invoke-static {p2}, Le/f/b/b/h;->a([Ljava/lang/Object;)Le/f/b/b/h;

    move-result-object p1

    iput-object p1, p0, Le/f/b/c/q;->b:Le/f/b/b/h;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/io/File;[Le/f/b/c/n;Le/f/b/c/o;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Le/f/b/c/q;-><init>(Ljava/io/File;[Le/f/b/c/n;)V

    return-void
.end method


# virtual methods
.method public a()Ljava/io/FileOutputStream;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2
    new-instance v0, Ljava/io/FileOutputStream;

    iget-object v1, p0, Le/f/b/c/q;->a:Ljava/io/File;

    iget-object v2, p0, Le/f/b/c/q;->b:Le/f/b/b/h;

    sget-object v3, Le/f/b/c/n;->b:Le/f/b/c/n;

    invoke-virtual {v2, v3}, Le/f/b/b/e;->contains(Ljava/lang/Object;)Z

    move-result v2

    invoke-direct {v0, v1, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V

    return-object v0
.end method

.method public bridge synthetic a()Ljava/io/OutputStream;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Le/f/b/c/q;->a()Ljava/io/FileOutputStream;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    iget-object v0, p0, Le/f/b/c/q;->a:Ljava/io/File;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Le/f/b/c/q;->b:Le/f/b/b/h;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, 0x14

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/2addr v2, v3

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "Files.asByteSink("

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
