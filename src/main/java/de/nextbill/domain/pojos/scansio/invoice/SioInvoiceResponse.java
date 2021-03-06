/*
 * NextBill server application
 *
 * @author Michael Roedel
 * Copyright (c) 2020 Michael Roedel
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package de.nextbill.domain.pojos.scansio.invoice;

import de.nextbill.domain.pojos.scansio.enums.SioContentType;
import de.nextbill.domain.pojos.scansio.enums.WorkflowStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SioInvoiceResponse {

    private String id;

    private WorkflowStatus workflowStatus;

    private SioContentType ocrEngineType;

    private String configuratioName;

    private String imageBase64;

    private String resultData;

    private String identificationKey;

    private SioInvoiceResultsResponse results;
}
