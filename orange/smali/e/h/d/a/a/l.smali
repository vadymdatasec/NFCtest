.class public final Le/h/d/a/a/l;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lcom/orange/oab/contactless/packid/ContactlessType;

.field public b:Ljava/lang/Integer;

.field public c:Lcom/orange/oab/contactless/packid/ContactlessType;


# direct methods
.method public constructor <init>()V
    .locals 6

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x7

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Le/h/d/a/a/l;-><init>(Lcom/orange/oab/contactless/packid/ContactlessType;Ljava/lang/Integer;Lcom/orange/oab/contactless/packid/ContactlessType;ILi/h/c/g;)V

    return-void
.end method

.method public constructor <init>(Lcom/orange/oab/contactless/packid/ContactlessType;Ljava/lang/Integer;Lcom/orange/oab/contactless/packid/ContactlessType;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/h/d/a/a/l;->a:Lcom/orange/oab/contactless/packid/ContactlessType;

    .line 3
    iput-object p2, p0, Le/h/d/a/a/l;->b:Ljava/lang/Integer;

    .line 4
    iput-object p3, p0, Le/h/d/a/a/l;->c:Lcom/orange/oab/contactless/packid/ContactlessType;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/orange/oab/contactless/packid/ContactlessType;Ljava/lang/Integer;Lcom/orange/oab/contactless/packid/ContactlessType;ILi/h/c/g;)V
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    .line 5
    sget-object p1, Lcom/orange/oab/contactless/packid/ContactlessType;->BLE:Lcom/orange/oab/contactless/packid/ContactlessType;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    const/16 p2, 0xc

    .line 6
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    .line 7
    sget-object p3, Lcom/orange/oab/contactless/packid/ContactlessType;->BLE:Lcom/orange/oab/contactless/packid/ContactlessType;

    .line 8
    :cond_2
    invoke-direct {p0, p1, p2, p3}, Le/h/d/a/a/l;-><init>(Lcom/orange/oab/contactless/packid/ContactlessType;Ljava/lang/Integer;Lcom/orange/oab/contactless/packid/ContactlessType;)V

    return-void
.end method


# virtual methods
.method public final a()Lcom/orange/oab/contactless/packid/ContactlessType;
    .locals 1

    .line 1
    iget-object v0, p0, Le/h/d/a/a/l;->a:Lcom/orange/oab/contactless/packid/ContactlessType;

    return-object v0
.end method

.method public final a(Lcom/orange/oab/contactless/packid/ContactlessType;)V
    .locals 0

    .line 2
    iput-object p1, p0, Le/h/d/a/a/l;->a:Lcom/orange/oab/contactless/packid/ContactlessType;

    return-void
.end method

.method public final a(Ljava/lang/Integer;)V
    .locals 0

    .line 3
    iput-object p1, p0, Le/h/d/a/a/l;->b:Ljava/lang/Integer;

    return-void
.end method

.method public final b()Lcom/orange/oab/contactless/packid/ContactlessType;
    .locals 1

    .line 1
    iget-object v0, p0, Le/h/d/a/a/l;->c:Lcom/orange/oab/contactless/packid/ContactlessType;

    return-object v0
.end method

.method public final b(Lcom/orange/oab/contactless/packid/ContactlessType;)V
    .locals 0

    .line 2
    iput-object p1, p0, Le/h/d/a/a/l;->c:Lcom/orange/oab/contactless/packid/ContactlessType;

    return-void
.end method

.method public final c()Ljava/lang/Integer;
    .locals 1

    .line 1
    iget-object v0, p0, Le/h/d/a/a/l;->b:Ljava/lang/Integer;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Le/h/d/a/a/l;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Le/h/d/a/a/l;

    iget-object v1, p0, Le/h/d/a/a/l;->a:Lcom/orange/oab/contactless/packid/ContactlessType;

    iget-object v3, p1, Le/h/d/a/a/l;->a:Lcom/orange/oab/contactless/packid/ContactlessType;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Le/h/d/a/a/l;->b:Ljava/lang/Integer;

    iget-object v3, p1, Le/h/d/a/a/l;->b:Ljava/lang/Integer;

    invoke-static {v1, v3}, Li/h/c/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Le/h/d/a/a/l;->c:Lcom/orange/oab/contactless/packid/ContactlessType;

    iget-object p1, p1, Le/h/d/a/a/l;->c:Lcom/orange/oab/contactless/packid/ContactlessType;

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Le/h/d/a/a/l;->a:Lcom/orange/oab/contactless/packid/ContactlessType;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Enum;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Le/h/d/a/a/l;->b:Ljava/lang/Integer;

    if-nez v2, :cond_1

    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Le/h/d/a/a/l;->c:Lcom/orange/oab/contactless/packid/ContactlessType;

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Enum;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ContactlessTypeInformation(contactlessDown="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/h/d/a/a/l;->a:Lcom/orange/oab/contactless/packid/ContactlessType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", contactlessVersionThreshold="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/h/d/a/a/l;->b:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", contactlessUp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/h/d/a/a/l;->c:Lcom/orange/oab/contactless/packid/ContactlessType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
