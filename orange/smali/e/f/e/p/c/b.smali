.class public final Le/f/e/p/c/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Le/f/e/l;

.field public final b:Le/f/e/l;

.field public final c:I


# direct methods
.method public constructor <init>(Le/f/e/l;Le/f/e/l;I)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Le/f/e/p/c/b;->a:Le/f/e/l;

    .line 4
    iput-object p2, p0, Le/f/e/p/c/b;->b:Le/f/e/l;

    .line 5
    iput p3, p0, Le/f/e/p/c/b;->c:I

    return-void
.end method

.method public synthetic constructor <init>(Le/f/e/l;Le/f/e/l;ILe/f/e/p/c/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Le/f/e/p/c/b;-><init>(Le/f/e/l;Le/f/e/l;I)V

    return-void
.end method


# virtual methods
.method public a()Le/f/e/l;
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/e/p/c/b;->a:Le/f/e/l;

    return-object v0
.end method

.method public b()Le/f/e/l;
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/e/p/c/b;->b:Le/f/e/l;

    return-object v0
.end method

.method public c()I
    .locals 1

    .line 1
    iget v0, p0, Le/f/e/p/c/b;->c:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Le/f/e/p/c/b;->a:Le/f/e/l;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/f/e/p/c/b;->b:Le/f/e/l;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x2f

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget v1, p0, Le/f/e/p/c/b;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
