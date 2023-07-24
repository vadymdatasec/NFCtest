.class public enum Lcom/orange/oab/contactless/packid/rssi/RssiLevel;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/orange/oab/contactless/packid/rssi/RssiLevel$a;,
        Lcom/orange/oab/contactless/packid/rssi/RssiLevel$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/orange/oab/contactless/packid/rssi/RssiLevel;",
        ">;"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/orange/oab/contactless/packid/rssi/RssiLevel$a;

.field public static final enum FIVE:Lcom/orange/oab/contactless/packid/rssi/RssiLevel;

.field public static final enum FOUR:Lcom/orange/oab/contactless/packid/rssi/RssiLevel;

.field public static final enum ONE:Lcom/orange/oab/contactless/packid/rssi/RssiLevel;

.field public static final enum THREE:Lcom/orange/oab/contactless/packid/rssi/RssiLevel;

.field public static final enum TWO:Lcom/orange/oab/contactless/packid/rssi/RssiLevel;

.field public static final enum ZERO:Lcom/orange/oab/contactless/packid/rssi/RssiLevel;

.field public static final synthetic d:[Lcom/orange/oab/contactless/packid/rssi/RssiLevel;


# instance fields
.field public final b:I

.field public final c:I


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lcom/orange/oab/contactless/packid/rssi/RssiLevel;

    const/4 v1, -0x1

    const/4 v2, 0x0

    const-string v3, "ZERO"

    invoke-direct {v0, v3, v2, v1, v1}, Lcom/orange/oab/contactless/packid/rssi/RssiLevel;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/orange/oab/contactless/packid/rssi/RssiLevel;->ZERO:Lcom/orange/oab/contactless/packid/rssi/RssiLevel;

    new-instance v0, Lcom/orange/oab/contactless/packid/rssi/RssiLevel;

    const/16 v1, 0x46

    const-string v3, "ONE"

    const/4 v4, 0x1

    const/16 v5, 0x64

    invoke-direct {v0, v3, v4, v5, v1}, Lcom/orange/oab/contactless/packid/rssi/RssiLevel;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/orange/oab/contactless/packid/rssi/RssiLevel;->ONE:Lcom/orange/oab/contactless/packid/rssi/RssiLevel;

    new-instance v0, Lcom/orange/oab/contactless/packid/rssi/RssiLevel;

    const/16 v3, 0x28

    const-string v4, "TWO"

    const/4 v5, 0x2

    invoke-direct {v0, v4, v5, v1, v3}, Lcom/orange/oab/contactless/packid/rssi/RssiLevel;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/orange/oab/contactless/packid/rssi/RssiLevel;->TWO:Lcom/orange/oab/contactless/packid/rssi/RssiLevel;

    new-instance v0, Lcom/orange/oab/contactless/packid/rssi/RssiLevel;

    const/16 v1, 0x14

    const-string v4, "THREE"

    const/4 v5, 0x3

    invoke-direct {v0, v4, v5, v3, v1}, Lcom/orange/oab/contactless/packid/rssi/RssiLevel;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/orange/oab/contactless/packid/rssi/RssiLevel;->THREE:Lcom/orange/oab/contactless/packid/rssi/RssiLevel;

    new-instance v0, Lcom/orange/oab/contactless/packid/rssi/RssiLevel;

    const-string v3, "FOUR"

    const/4 v4, 0x4

    invoke-direct {v0, v3, v4, v1, v2}, Lcom/orange/oab/contactless/packid/rssi/RssiLevel;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/orange/oab/contactless/packid/rssi/RssiLevel;->FOUR:Lcom/orange/oab/contactless/packid/rssi/RssiLevel;

    new-instance v0, Lcom/orange/oab/contactless/packid/rssi/RssiLevel$b;

    const-string v1, "FIVE"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/orange/oab/contactless/packid/rssi/RssiLevel$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/orange/oab/contactless/packid/rssi/RssiLevel;->FIVE:Lcom/orange/oab/contactless/packid/rssi/RssiLevel;

    invoke-static {}, Lcom/orange/oab/contactless/packid/rssi/RssiLevel;->a()[Lcom/orange/oab/contactless/packid/rssi/RssiLevel;

    move-result-object v0

    sput-object v0, Lcom/orange/oab/contactless/packid/rssi/RssiLevel;->d:[Lcom/orange/oab/contactless/packid/rssi/RssiLevel;

    new-instance v0, Lcom/orange/oab/contactless/packid/rssi/RssiLevel$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/orange/oab/contactless/packid/rssi/RssiLevel$a;-><init>(Li/h/c/g;)V

    sput-object v0, Lcom/orange/oab/contactless/packid/rssi/RssiLevel;->Companion:Lcom/orange/oab/contactless/packid/rssi/RssiLevel$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;III)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/orange/oab/contactless/packid/rssi/RssiLevel;->b:I

    iput p4, p0, Lcom/orange/oab/contactless/packid/rssi/RssiLevel;->c:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;IIILi/h/c/g;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/orange/oab/contactless/packid/rssi/RssiLevel;-><init>(Ljava/lang/String;III)V

    return-void
.end method

.method public static final synthetic a()[Lcom/orange/oab/contactless/packid/rssi/RssiLevel;
    .locals 3

    const/4 v0, 0x6

    new-array v0, v0, [Lcom/orange/oab/contactless/packid/rssi/RssiLevel;

    sget-object v1, Lcom/orange/oab/contactless/packid/rssi/RssiLevel;->ZERO:Lcom/orange/oab/contactless/packid/rssi/RssiLevel;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/orange/oab/contactless/packid/rssi/RssiLevel;->ONE:Lcom/orange/oab/contactless/packid/rssi/RssiLevel;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/orange/oab/contactless/packid/rssi/RssiLevel;->TWO:Lcom/orange/oab/contactless/packid/rssi/RssiLevel;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lcom/orange/oab/contactless/packid/rssi/RssiLevel;->THREE:Lcom/orange/oab/contactless/packid/rssi/RssiLevel;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lcom/orange/oab/contactless/packid/rssi/RssiLevel;->FOUR:Lcom/orange/oab/contactless/packid/rssi/RssiLevel;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lcom/orange/oab/contactless/packid/rssi/RssiLevel;->FIVE:Lcom/orange/oab/contactless/packid/rssi/RssiLevel;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/orange/oab/contactless/packid/rssi/RssiLevel;
    .locals 1

    const-class v0, Lcom/orange/oab/contactless/packid/rssi/RssiLevel;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/orange/oab/contactless/packid/rssi/RssiLevel;

    return-object p0
.end method

.method public static values()[Lcom/orange/oab/contactless/packid/rssi/RssiLevel;
    .locals 1

    sget-object v0, Lcom/orange/oab/contactless/packid/rssi/RssiLevel;->d:[Lcom/orange/oab/contactless/packid/rssi/RssiLevel;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/orange/oab/contactless/packid/rssi/RssiLevel;

    return-object v0
.end method


# virtual methods
.method public final a(I)F
    .locals 2

    .line 1
    iget v0, p0, Lcom/orange/oab/contactless/packid/rssi/RssiLevel;->b:I

    int-to-float v0, v0

    const/high16 v1, 0x42c80000    # 100.0f

    div-float/2addr v0, v1

    int-to-float p1, p1

    const/high16 v1, -0x3d020000    # -127.0f

    sub-float/2addr v1, p1

    mul-float v0, v0, v1

    add-float/2addr v0, p1

    return v0
.end method

.method public getMaxLevel(I)F
    .locals 2

    .line 1
    iget v0, p0, Lcom/orange/oab/contactless/packid/rssi/RssiLevel;->c:I

    int-to-float v0, v0

    const/high16 v1, 0x42c80000    # 100.0f

    div-float/2addr v0, v1

    int-to-float p1, p1

    const/high16 v1, -0x3d020000    # -127.0f

    sub-float/2addr v1, p1

    mul-float v0, v0, v1

    add-float/2addr v0, p1

    return v0
.end method

.method public final isInRange(II)Z
    .locals 1

    .line 1
    invoke-virtual {p0, p2}, Lcom/orange/oab/contactless/packid/rssi/RssiLevel;->a(I)F

    move-result v0

    .line 2
    invoke-virtual {p0, p2}, Lcom/orange/oab/contactless/packid/rssi/RssiLevel;->getMaxLevel(I)F

    move-result p2

    int-to-float p1, p1

    cmpg-float v0, v0, p1

    if-gez v0, :cond_0

    cmpg-float p1, p1, p2

    if-gtz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
