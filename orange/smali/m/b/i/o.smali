.class public final enum Lm/b/i/o;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lm/b/i/o;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum f:Lm/b/i/o;

.field public static final enum g:Lm/b/i/o;

.field public static final enum h:Lm/b/i/o;

.field public static final synthetic i:[Lm/b/i/o;


# instance fields
.field public b:[Ljava/lang/String;

.field public c:[I

.field public d:[I

.field public e:[Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Lm/b/i/o;

    const/4 v1, 0x0

    const-string v2, "xhtml"

    const-string v3, "entities-xhtml.properties"

    const/4 v4, 0x4

    invoke-direct {v0, v2, v1, v3, v4}, Lm/b/i/o;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Lm/b/i/o;->f:Lm/b/i/o;

    .line 2
    new-instance v0, Lm/b/i/o;

    const/4 v2, 0x1

    const-string v3, "base"

    const-string v4, "entities-base.properties"

    const/16 v5, 0x6a

    invoke-direct {v0, v3, v2, v4, v5}, Lm/b/i/o;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Lm/b/i/o;->g:Lm/b/i/o;

    .line 3
    new-instance v0, Lm/b/i/o;

    const/4 v3, 0x2

    const-string v4, "extended"

    const-string v5, "entities-full.properties"

    const/16 v6, 0x84d

    invoke-direct {v0, v4, v3, v5, v6}, Lm/b/i/o;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Lm/b/i/o;->h:Lm/b/i/o;

    const/4 v4, 0x3

    new-array v4, v4, [Lm/b/i/o;

    .line 4
    sget-object v5, Lm/b/i/o;->f:Lm/b/i/o;

    aput-object v5, v4, v1

    sget-object v1, Lm/b/i/o;->g:Lm/b/i/o;

    aput-object v1, v4, v2

    aput-object v0, v4, v3

    sput-object v4, Lm/b/i/o;->i:[Lm/b/i/o;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    invoke-static {p0, p3, p4}, Lm/b/i/p;->a(Lm/b/i/o;Ljava/lang/String;I)V

    return-void
.end method

.method public static synthetic a(Lm/b/i/o;[I)[I
    .locals 0

    .line 3
    iput-object p1, p0, Lm/b/i/o;->c:[I

    return-object p1
.end method

.method public static synthetic a(Lm/b/i/o;)[Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lm/b/i/o;->b:[Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic a(Lm/b/i/o;[Ljava/lang/String;)[Ljava/lang/String;
    .locals 0

    .line 2
    iput-object p1, p0, Lm/b/i/o;->b:[Ljava/lang/String;

    return-object p1
.end method

.method public static synthetic b(Lm/b/i/o;)[I
    .locals 0

    .line 1
    iget-object p0, p0, Lm/b/i/o;->c:[I

    return-object p0
.end method

.method public static synthetic b(Lm/b/i/o;[I)[I
    .locals 0

    .line 2
    iput-object p1, p0, Lm/b/i/o;->d:[I

    return-object p1
.end method

.method public static synthetic b(Lm/b/i/o;[Ljava/lang/String;)[Ljava/lang/String;
    .locals 0

    .line 3
    iput-object p1, p0, Lm/b/i/o;->e:[Ljava/lang/String;

    return-object p1
.end method

.method public static synthetic c(Lm/b/i/o;)[I
    .locals 0

    .line 1
    iget-object p0, p0, Lm/b/i/o;->d:[I

    return-object p0
.end method

.method public static synthetic d(Lm/b/i/o;)[Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lm/b/i/o;->e:[Ljava/lang/String;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lm/b/i/o;
    .locals 1

    .line 1
    const-class v0, Lm/b/i/o;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lm/b/i/o;

    return-object p0
.end method

.method public static values()[Lm/b/i/o;
    .locals 1

    .line 1
    sget-object v0, Lm/b/i/o;->i:[Lm/b/i/o;

    invoke-virtual {v0}, [Lm/b/i/o;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lm/b/i/o;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;)I
    .locals 1

    .line 4
    iget-object v0, p0, Lm/b/i/o;->b:[Ljava/lang/String;

    invoke-static {v0, p1}, Ljava/util/Arrays;->binarySearch([Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_0

    .line 5
    iget-object v0, p0, Lm/b/i/o;->c:[I

    aget p1, v0, p1

    goto :goto_0

    :cond_0
    const/4 p1, -0x1

    :goto_0
    return p1
.end method

.method public a(I)Ljava/lang/String;
    .locals 4

    .line 6
    iget-object v0, p0, Lm/b/i/o;->d:[I

    invoke-static {v0, p1}, Ljava/util/Arrays;->binarySearch([II)I

    move-result v0

    if-ltz v0, :cond_1

    .line 7
    iget-object v1, p0, Lm/b/i/o;->e:[Ljava/lang/String;

    array-length v2, v1

    add-int/lit8 v2, v2, -0x1

    if-ge v0, v2, :cond_0

    iget-object v2, p0, Lm/b/i/o;->d:[I

    add-int/lit8 v3, v0, 0x1

    aget v2, v2, v3

    if-ne v2, p1, :cond_0

    aget-object p1, v1, v3

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lm/b/i/o;->e:[Ljava/lang/String;

    aget-object p1, p1, v0

    :goto_0
    return-object p1

    :cond_1
    const-string p1, ""

    return-object p1
.end method
