.class public Le/c/a/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Le/c/a/h;

.field public b:Le/c/a/y0;


# direct methods
.method public constructor <init>(Le/c/a/h;Le/c/a/y0;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Le/c/a/f;->a:Le/c/a/h;

    .line 3
    iput-object v0, p0, Le/c/a/f;->b:Le/c/a/y0;

    .line 4
    iput-object p1, p0, Le/c/a/f;->a:Le/c/a/h;

    .line 5
    iput-object p2, p0, Le/c/a/f;->b:Le/c/a/y0;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 2
    iget-object v1, p0, Le/c/a/f;->a:Le/c/a/h;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " {}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
