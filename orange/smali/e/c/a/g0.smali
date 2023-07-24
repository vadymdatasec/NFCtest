.class public Le/c/a/g0;
.super Le/c/a/i1;
.source "SourceFile"


# instance fields
.field public b:Ljava/lang/String;

.field public c:Le/c/a/i1;


# direct methods
.method public constructor <init>(Ljava/lang/String;Le/c/a/i1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Le/c/a/i1;-><init>()V

    .line 2
    iput-object p1, p0, Le/c/a/g0;->b:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Le/c/a/g0;->c:Le/c/a/i1;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/c/a/g0;->b:Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/c/a/g0;->c:Le/c/a/i1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
