.class public abstract Le/f/b/b/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/b/b/r;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        "E::",
        "Le/f/b/b/r<",
        "TK;TV;TE;>;>",
        "Ljava/lang/Object;",
        "Le/f/b/b/r<",
        "TK;TV;TE;>;"
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TK;"
        }
    .end annotation
.end field

.field public final b:I

.field public final c:Le/f/b/b/r;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TE;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Object;ILe/f/b/b/r;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;ITE;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/f/b/b/n;->a:Ljava/lang/Object;

    .line 3
    iput p2, p0, Le/f/b/b/n;->b:I

    .line 4
    iput-object p3, p0, Le/f/b/b/n;->c:Le/f/b/b/r;

    return-void
.end method


# virtual methods
.method public b()Le/f/b/b/r;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TE;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/f/b/b/n;->c:Le/f/b/b/r;

    return-object v0
.end method

.method public c()I
    .locals 1

    .line 1
    iget v0, p0, Le/f/b/b/n;->b:I

    return v0
.end method

.method public getKey()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TK;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/f/b/b/n;->a:Ljava/lang/Object;

    return-object v0
.end method
