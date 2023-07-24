.class public Le/c/a/r;
.super Le/c/a/i1;
.source "SourceFile"


# static fields
.field public static final c:Le/c/a/r;


# instance fields
.field public b:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Le/c/a/r;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Le/c/a/r;-><init>(I)V

    sput-object v0, Le/c/a/r;->c:Le/c/a/r;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Le/c/a/i1;-><init>()V

    .line 2
    iput p1, p0, Le/c/a/r;->b:I

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    .line 1
    iget v1, p0, Le/c/a/r;->b:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "#%06x"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
