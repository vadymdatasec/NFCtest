.class public final enum Le/f/e/t/b/i;
.super Le/f/e/t/b/k;
.source "SourceFile"


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, p2, v0}, Le/f/e/t/b/k;-><init>(Ljava/lang/String;ILe/f/e/t/b/c;)V

    return-void
.end method


# virtual methods
.method public a(II)Z
    .locals 0

    mul-int p1, p1, p2

    .line 1
    rem-int/lit8 p1, p1, 0x6

    const/4 p2, 0x3

    if-ge p1, p2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method