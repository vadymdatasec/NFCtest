.class public final Le/f/e/r/r/g/e/b;
.super Le/f/e/r/r/g/e/f;
.source "SourceFile"


# direct methods
.method public constructor <init>(Le/f/e/o/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Le/f/e/r/r/g/e/f;-><init>(Le/f/e/o/a;)V

    return-void
.end method


# virtual methods
.method public a(I)I
    .locals 1

    const/16 v0, 0x2710

    if-ge p1, v0, :cond_0

    return p1

    :cond_0
    sub-int/2addr p1, v0

    return p1
.end method

.method public c(Ljava/lang/StringBuilder;I)V
    .locals 1

    const/16 v0, 0x2710

    if-ge p2, v0, :cond_0

    const-string p2, "(3202)"

    .line 1
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void

    :cond_0
    const-string p2, "(3203)"

    .line 2
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method
