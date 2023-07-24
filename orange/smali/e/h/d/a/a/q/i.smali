.class public abstract enum Le/h/d/a/a/q/i;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Le/h/d/a/a/q/i;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum c:Le/h/d/a/a/q/i;

.field public static final enum d:Le/h/d/a/a/q/i;

.field public static final enum e:Le/h/d/a/a/q/i;

.field public static final enum f:Le/h/d/a/a/q/i;

.field public static final synthetic g:[Le/h/d/a/a/q/i;


# instance fields
.field public final b:Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;


# direct methods
.method public static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, Le/h/d/a/a/q/d;

    sget-object v1, Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;->START:Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;

    const/4 v2, 0x0

    const-string v3, "START"

    invoke-direct {v0, v3, v2, v1}, Le/h/d/a/a/q/d;-><init>(Ljava/lang/String;ILcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;)V

    sput-object v0, Le/h/d/a/a/q/i;->c:Le/h/d/a/a/q/i;

    .line 2
    new-instance v0, Le/h/d/a/a/q/e;

    sget-object v1, Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;->INTERRUPTED:Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;

    const/4 v3, 0x1

    const-string v4, "INTERRUPTED"

    invoke-direct {v0, v4, v3, v1}, Le/h/d/a/a/q/e;-><init>(Ljava/lang/String;ILcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;)V

    sput-object v0, Le/h/d/a/a/q/i;->d:Le/h/d/a/a/q/i;

    .line 3
    new-instance v0, Le/h/d/a/a/q/f;

    sget-object v1, Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;->ERROR:Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;

    const/4 v4, 0x2

    const-string v5, "ERROR"

    invoke-direct {v0, v5, v4, v1}, Le/h/d/a/a/q/f;-><init>(Ljava/lang/String;ILcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;)V

    sput-object v0, Le/h/d/a/a/q/i;->e:Le/h/d/a/a/q/i;

    .line 4
    new-instance v0, Le/h/d/a/a/q/g;

    sget-object v1, Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;->DONE:Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;

    const/4 v5, 0x3

    const-string v6, "DONE"

    invoke-direct {v0, v6, v5, v1}, Le/h/d/a/a/q/g;-><init>(Ljava/lang/String;ILcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;)V

    sput-object v0, Le/h/d/a/a/q/i;->f:Le/h/d/a/a/q/i;

    .line 5
    new-instance v0, Le/h/d/a/a/q/h;

    sget-object v1, Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;->INSUFFICIENT_SECURITY:Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;

    const/4 v6, 0x4

    const-string v7, "INSUFFICIENT_SECURITY"

    invoke-direct {v0, v7, v6, v1}, Le/h/d/a/a/q/h;-><init>(Ljava/lang/String;ILcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;)V

    const/4 v1, 0x5

    new-array v1, v1, [Le/h/d/a/a/q/i;

    .line 6
    sget-object v7, Le/h/d/a/a/q/i;->c:Le/h/d/a/a/q/i;

    aput-object v7, v1, v2

    sget-object v2, Le/h/d/a/a/q/i;->d:Le/h/d/a/a/q/i;

    aput-object v2, v1, v3

    sget-object v2, Le/h/d/a/a/q/i;->e:Le/h/d/a/a/q/i;

    aput-object v2, v1, v4

    sget-object v2, Le/h/d/a/a/q/i;->f:Le/h/d/a/a/q/i;

    aput-object v2, v1, v5

    aput-object v0, v1, v6

    sput-object v1, Le/h/d/a/a/q/i;->g:[Le/h/d/a/a/q/i;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;",
            ")V"
        }
    .end annotation

    .line 2
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 3
    iput-object p3, p0, Le/h/d/a/a/q/i;->b:Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;Le/h/d/a/a/q/d;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Le/h/d/a/a/q/i;-><init>(Ljava/lang/String;ILcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;)V

    return-void
.end method

.method public static a(Landroid/content/Context;Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;Ljava/lang/Integer;Ljava/lang/String;)Le/h/d/a/a/q/c;
    .locals 0

    .line 4
    invoke-static {p1}, Le/h/d/a/a/q/i;->a(Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;)Le/h/d/a/a/q/i;

    move-result-object p1

    invoke-virtual {p1, p0, p2, p3}, Le/h/d/a/a/q/i;->a(Landroid/content/Context;Ljava/lang/Integer;Ljava/lang/String;)Le/h/d/a/a/q/b;

    move-result-object p0

    invoke-virtual {p0}, Le/h/d/a/a/q/b;->a()Le/h/d/a/a/q/c;

    move-result-object p0

    return-object p0
.end method

.method public static a(Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;)Le/h/d/a/a/q/i;
    .locals 5

    .line 1
    invoke-static {}, Le/h/d/a/a/q/i;->values()[Le/h/d/a/a/q/i;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    .line 2
    iget-object v4, v3, Le/h/d/a/a/q/i;->b:Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;

    if-ne v4, p0, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 3
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "No "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-class v2, Le/h/d/a/a/q/i;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " for event type "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static valueOf(Ljava/lang/String;)Le/h/d/a/a/q/i;
    .locals 1

    .line 1
    const-class v0, Le/h/d/a/a/q/i;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Le/h/d/a/a/q/i;

    return-object p0
.end method

.method public static values()[Le/h/d/a/a/q/i;
    .locals 1

    .line 1
    sget-object v0, Le/h/d/a/a/q/i;->g:[Le/h/d/a/a/q/i;

    invoke-virtual {v0}, [Le/h/d/a/a/q/i;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Le/h/d/a/a/q/i;

    return-object v0
.end method


# virtual methods
.method public abstract a(Landroid/content/Context;Ljava/lang/Integer;Ljava/lang/String;)Le/h/d/a/a/q/b;
.end method
